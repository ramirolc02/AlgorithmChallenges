package ex570;
import java.io.*;
import java.util.*;

public class dni {

    final static String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static void main(String[] args) {
        try ( Scanner in = new Scanner(new BufferedInputStream(System.in))) {
            int[] marcas = new int[4];
            while ( in.hasNext() ) {
                String dni = in.next();
                System.err.println(String.format("'%s'", dni));
                int nMarcas = contar(dni, marcas);
                int nOK = dniOK_2(dni, marcas);
                System.out.println(nOK);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static int[] pot = { 10000000, 1000000, 100000, 10000, 
        1000, 100, 10, 1 };

    private static int dniOK_2(String dni, int[] marcas) {
        int nOK = 0;
        final String dniSinMarcas = dni.replace('?', '0');
        final String dniSinLetra = dniSinMarcas.substring(0, dniSinMarcas.length()-1);
        int numero = Integer.parseInt(dniSinLetra);
        System.err.println("El numero es " + numero);
        for ( int cf1 = 0; cf1 <= 9; ++cf1 ) {
            for ( int cf2 = 0; cf2 <= 9; ++cf2 ) {
                int valor = numero + cf1 * pot[marcas[0]];
                valor += cf2 * pot[marcas[1]];
                if ( letras.charAt(valor % 23) == dni.charAt(8) ) {
                    ++nOK;
                }
            }    
        }
        return nOK;
    }

    private static int contar(String dni, int[] marcas) {
        int nMarcas = 0;
        for ( int i = 0; i < dni.length(); ++i ) {
            if ( dni.charAt(i) == '?' ) {
                marcas[nMarcas] = i;
                ++nMarcas;
            }
        }
        return nMarcas;
    }
}