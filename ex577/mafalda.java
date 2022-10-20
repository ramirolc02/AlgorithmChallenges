package ex577;
import java.io.BufferedInputStream;
import java.util.Scanner;

public class mafalda {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024))) {
           int n = sc.nextInt(); // casos
           int contador = 0;
           while( n > 0){
            contador = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c){
                    while( a != c+1 && b != -1){
                        contador++;
                        a++;
                        b--;
                    }
                    System.out.println(contador);
                }
            else if (a + b < c){
                 a = c-b;
                 while( a != c+1 && b != -1){
                    contador++;
                    a++;
                    b--;
                }
                System.out.println(contador);
            }
            else{
                while( a != c+1 && b != -1){
                    b = c-a;
                    while( a != c+1 && b != -1){
                        contador++;
                        a++;
                        b--;
                    }
                    System.out.println(contador);
                }
            }
            n--;
            }

           }
     catch (Exception e) {
           System.exit(1);
       } 
   } 
}

