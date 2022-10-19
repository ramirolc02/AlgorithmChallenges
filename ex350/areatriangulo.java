package ex350;
import java.io.BufferedInputStream;
import java.util.Scanner;
// import

public class areatriangulo {
    public static void main(String[] args) {

         try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024))) {
            float a = sc.nextInt();
            float b = sc.nextInt();
            while (!(a == 0 && b == 0)) {
              //  System.out.println(String.format("%4d, %4d", a, b)); //Imprimes 
                //la entrada de datos para asegurarte de que se lee bien 
                System.out.printf("%.1f\n",(a*b)/2);
                a = sc.nextInt();
                b = sc.nextInt();
            }
        } catch (Exception e) {
            System.exit(1);
        } 
    }  // 

}