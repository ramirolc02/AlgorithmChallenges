package ex435;
import java.io.BufferedInputStream;
import java.util.Scanner;

public class pijote {

    private static boolean no_subnormal(int[] contador){
        boolean aux = true;
        int j=0;
        while(aux && j < 9){
            aux = contador[j] == contador[j+1];
            j++;
        }
        return aux;
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024))) {
            while(sc.hasNextLine()){
            char[] cadena = sc.nextLine().toCharArray();
            int size = cadena.length;
            int contador [] = new int[10];
            for(int i =0; i < size; i++){
                // getnumericvalue para char 
                contador[Integer.parseInt(String.valueOf(cadena[i]))]++;
            }
            String salida = (no_subnormal(contador)) ? "subnormal" : "no subnormal";
            System.out.println(salida);
        }
        } catch (Exception e) {
           System.exit(1);
        }
    }
}
