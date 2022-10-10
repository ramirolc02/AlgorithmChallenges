
#include <stdio.h>
#include <stdlib.h>

const char* letras = "TRWAGMYFPDXBNJZSQVHLCKE";

// inline incrusta codigo de la funcion en la llamada 

int dniOK(char* dni, int nMarcas, int* marcas){
    char r1,r2;
    int numero;
    int nOK=0;
    for(r1 ='0';r1<='9';++r1){
        for(r2 ='0';r2 <='9';++r2){
            dni[marcas[0]] = r1;
            dni[marcas[1]] = r2;
            numero=atoi(dni);
            if(letras[numero%23] == dni[8]){
                nOK++;
            }
        }
    }
    return nOK;
}

int contar(const char *dni, int* marcas){
    int cuenta = 0;
    int i = 0;
    //  Mientras que no sea cero 
    while( *dni){
        //preincremento tarda menos, se ahorra una copia.
        if(*dni == '?'){
            marcas[cuenta]=i;
            ++cuenta;
        }
        ++dni;
        ++i;
    }
    return cuenta;
}
int main (){

char dni[16];
int marcas[4];
int nMarcas;
int nOK;

while(scanf("%15s",dni) == 1){
    // devuelve EOF si termino 
    fprintf(stderr, "El dni leido es: '%s'\n",dni);
    nMarcas=contar(dni,marcas);
    fprintf(stderr,"Hay %d marcas y estan en %d,%d\n",nMarcas,marcas[0],marcas[1]);
    nOK= dniOK(dni, nMarcas,marcas);
    printf("%d\n",nOK);
}

return 0; 

//scan se salta todos los blancos 

}