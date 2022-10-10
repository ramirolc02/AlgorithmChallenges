package ex437;
import java.io.BufferedInputStream;
import java.util.Scanner;

public class anuncio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in, 1024));
        int numeroCasos = sc.nextInt();
        int tiempoAnuncio = 0;
        int tiempoRestante = 0;
        while (numeroCasos > 0) {
            String startClass = sc.next();
            String [] split = startClass.split(":");
            tiempoAnuncio = Integer.parseInt(split[0]) * 3600;
            tiempoAnuncio += Integer.parseInt(split[1]) * 60;
            tiempoAnuncio += Integer.parseInt(split[2]) * 1;

            tiempoRestante = 86400 - tiempoAnuncio;

            System.out.format("%02d:%02d:%02d\n", tiempoRestante / 3600, (tiempoRestante % 3600) / 60, ((tiempoRestante % 3600) % 60));

            numeroCasos--;
        }
    
    }
}