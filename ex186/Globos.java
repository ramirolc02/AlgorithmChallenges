package ex186;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Globos {

    private static int indexOfMax(int [] arr) {
        int maxIndex = 0;
        int max = arr[0];
        boolean empate = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
                empate = false;
            } else if (arr[i] == max) {
                empate = true;
            }
        }
        return (empate) ? -1 : maxIndex + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in, 1024));
        int numeroEquipos;
        int numeroGlobos;
        int ganador;
        while (sc.hasNextLine()) {
            numeroEquipos = sc.nextInt();
            numeroGlobos = sc.nextInt();
            if (numeroEquipos == 0) break;
            int globos [] = new int [numeroEquipos];

            while (numeroGlobos > 0) {
                globos[sc.nextInt() - 1]++;
                sc.nextLine();
                numeroGlobos--;
            }
            ganador = indexOfMax(globos);
            if (ganador == -1) {
                System.out.println("EMPATE");
            } else {
                System.out.println(ganador);
            }
            ganador = -1;
            numeroEquipos = 0;
            numeroGlobos = 0;
        }
    }
}
