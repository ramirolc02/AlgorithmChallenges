package ex104;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class movil {
    public static void main( String []args) {
        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1 * 1024))) {
            while (true) {
                String array[] = sc.nextLine().split(" ");

                if(Integer.parseInt(array[0]) == 0 &&Integer.parseInt(array[1]) == 0 && Integer.parseInt(array[2]) == 0 &&Integer.parseInt(array[3]) == 0){
                    break;
                }
                int resul = recur(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]),
                        Integer.parseInt(array[3]), sc);
                if (resul == -1) {
                    System.out.println("NO");
                } else {
                    System.out.println("SI");
                }

            }
        } catch (Exception e) {
                  //e.printStackTrace();
                  System.exit(0);
        }

    }

    public static int recur(int pi, int di, int pd, int dd, Scanner sc) {
        String array[];
        int resul = 0;
        boolean balan = true;
        if (pi == 0) {
            array = sc.nextLine().split(" ");
            pi = recur(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]), sc);
        }
        if (pd == 0) {
            array = sc.nextLine().split(" ");
            pd = recur(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]), sc);
        }
        if (pi == -1|| pd == -1)  {
            return -1;
        }
        balan = pi * di == pd * dd;
        if (balan) {
            resul = pi + pd;
            return resul;
        } else {
            return -1;
        }
    }
}