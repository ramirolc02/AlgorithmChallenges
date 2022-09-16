#include <stdio.h>

int main (int argc, char const *argv[]){
 int num;
 scanf(" %d", &num);
 while(num > 0){
     long long int dim,res; 
    scanf(" %llu", &dim);
    res = (6*dim*dim) - (12*dim) + 8;
    printf("%llu\n", res);
    num--;
 }
    return 0;
}