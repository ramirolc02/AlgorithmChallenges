package ex569;
import java.util.Scanner;

public class partidita {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        

        int testCases = scanner.nextInt();

        while(testCases>0){

            int playTime = scanner.nextInt();
            int numClases = scanner.nextInt();

            int[][] arr = new int[numClases+2][2];
            arr[0][1] = 480;
            arr[arr.length-1][0] = 840;

            int totalTime = 0;
            
            for(int i=1; i<arr.length-1; i++){
                String startClass = scanner.next();
                int duration = scanner.nextInt();

                String[] splitted = startClass.split(":");

                int hh = Integer.parseInt(splitted[0]);
                int mm = Integer.parseInt(splitted[1]);
                

                hh = hh*60+mm;
                arr[i][0] = hh;
                
                int hhmm = hh+duration;
                arr[i][1] = hhmm;

                
            }


            for(int i=1; i<arr.length; i++){
                int aux = arr[i][0]-arr[i-1][1];

                if(aux>=playTime) totalTime+=aux;


            
            }


            System.out.println(totalTime);

            testCases--;
        }

        
    }
    catch (Exception e) {
           
        System.exit(1);
 }
    }
}
