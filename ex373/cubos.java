package ex373;
import java.io.BufferedInputStream;
import java.util.Scanner;
import java.lang.Math;
public class cubos {
    public static void main(String []args){
        try(Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024))){
            int num = sc.nextInt();
            long dim, value;
            while(num > 0){
                sc.nextLine();
                dim = sc.nextInt();
                value = 6*(long)Math.pow(dim,2)-12*dim + 8; // ecuacion
                System.out.println(value);
                num--;
            }
        }
        catch (Exception e) {
            System.exit(1);
       }
    }

}
