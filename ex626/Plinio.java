package ex626;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Plinio {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1 * 1024))) {

            int n = sc.nextInt(); // casos
            sc.nextLine();

            while(n > 0){
                String linea = sc.nextLine();
                String [] fecha = linea.split("/");
                if( Integer.parseInt(fecha[2]) % 4 == 0 ){
                    if (Integer.parseInt(fecha[1])>2 ||  (Integer.parseInt(fecha[1])==2 && Integer.parseInt(fecha[0]) >= 29)){
                        System.out.println( String.format("29/02/%04d", Integer.parseInt(fecha[2])+4));
                    }
                    else{
                        System.out.println( String.format("29/02/%04d", Integer.parseInt(fecha[2])));   
                    }
                }
                else{

                    int valor = Integer.parseInt(fecha[2])%4 ;
                    System.out.println( String.format("29/02/%04d", Integer.parseInt(fecha[2]) + 4 - valor));   
                }
                n--;
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
