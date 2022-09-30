package ex502;
import java.util.Scanner;

public class mejillones {
        public static void main(String[] args) {
            
            try(Scanner scanner = new Scanner(System.in)){
    
            while(scanner.hasNext()){
    
                int num = scanner.nextInt();
                int[] arr = new int[num];
    
                for(int i=0; i<arr.length; i++){
                    arr[i]=scanner.nextInt();
                }
    
                int[] arr2 = new int[num];
                arr2[0]=arr[0];
                int torres = 1;
                
                for(int i=1; i<arr2.length; i++){
    
                    int diferencia=0;
                    int left = 0;
                    int right = arr2.length-1;
                    int mid = (left+right)/2;
                    while(left<mid && mid<right){
                        if(arr2[mid]==arr[i]) break;
                        else if(arr2[mid]<arr[i]){
                            left = mid+1;
                        }
                        else{
                            right=mid-1;
                        }
                        mid = (left+right)/2;
                    }
    
                    arr2[mid]=arr[i];
    
                    if(diferencia<=0) {
                        arr2[torres]=arr[i];
                        torres++;
                    }
    
                    
                }
    
                System.out.println(torres);
    
            }
        }
         catch (Exception e) {
           
                System.exit(1);
         }
        }
}
