package ex138;
import java.io.BufferedInputStream;
import java.util.Scanner;
public class cerosFactorial {

    // sin resolver
    public static int ceroFactorial(long a){
        int ceros = 0;
        int i = 5;
        while (a/i >= 1){
            ceros += a/i;
            i *= 5;
        }
        return ceros;
    }
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024))) {
            int n = sc.nextInt();
            while (n != 0) {
                long a = sc.nextInt();
                if (a == 0){
                    System.out.println("1");
                } else {
                    System.out.println(ceroFactorial(a));
                }
                n--;
            }
           
           }
        catch (Exception e) {
           System.exit(1);
       } 
   }  
}

