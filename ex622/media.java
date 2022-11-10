package ex622;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class media {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1 * 1024))) {

            int n = sc.nextInt(); // casos
            while(n != 0){
                int suma = 0;
                for (int i=0;i<n;i++ ){
                    suma += sc.nextInt();
                }

                int valor = sc.nextInt()*(n+1);

                if (valor - suma > 10 || valor - suma < 0){
                    System.out.println("IMPOSIBLE");
                }
                else{
                    System.out.println(valor - suma);
                }

                n = sc.nextInt(); 
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
