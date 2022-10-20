package ex490;
import java.io.BufferedInputStream;
import java.util.Scanner;

public class navidad {
    public static int gradoSatisfaccion( int [] arr, int k){
        int max = 0;
        for (int i = 0; i < arr.length-k+1;i++){
            if (arr[i] > arr[i+k-1] && max < (arr[i] - arr[i+k-1])){
                max = arr[i] - arr[i+k-1];
            }
            else if (arr[i] < arr[i+k-1] && max < (arr[i+k-1] - arr[i])){
                max =  arr[i+k-1] - arr[i];  
            } 
            }
            return max ;
        }
        
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024))) {

        while(sc.hasNext()){
           int n = sc.nextInt(); // total
           int m = sc.nextInt(); // recorrer
           int [] array = new int [n];

           for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
           }

           System.out.println(gradoSatisfaccion(array, m));

            }



           }
     catch (Exception e) {
           System.exit(1);
       } 
   } 
    
}
