package ex304;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class euclidea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedInputStream(System.in, 1 * 1024))) {
            int casos = sc.nextInt();

            while (casos > 0) {
                int dividendo = sc.nextInt();
                int divisor = sc.nextInt();
                System.err.println(String.format("%d / %d", dividendo, divisor));

                if (divisor == 0) {
                    System.out.println("DIV0");
                } else if (dividendo == 0) {

                } else if (dividendo > 0 && divisor > 0) {

                } else {

                }
                --casos;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
