package ex441;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class contar {
    public static String suma( char[] cadena) {
		int i = cadena.length - 1;
		while(i > -1) {
			if(cadena[i] != '.') {
			        if( cadena[i]=='9') {
                        cadena[i] = '0';
                        if(i==0) {
                            if(cadena.length == 3){
                                return "1." + String.valueOf(cadena);
                            }
                            else if(cadena.length > 4 && cadena[3]=='.'){
                                return "1." + String.valueOf(cadena);
                            }
                            else{
                                return "1" + String.valueOf(cadena);
                            }
                        }
                    }else  {
                       cadena[i]++;
                       break;
			        }
                }
            i--;
		}
		return String.valueOf(cadena);
	}
	public static void main(String[] args) {
		char[] cadena;
		try(Scanner s = new Scanner(new BufferedInputStream(System.in, 1*1024)))
		{
			while(s.hasNext()) 
			{
				
				cadena = s.nextLine().toCharArray();
				System.out.println(suma(cadena));
			}
		}
		catch(Exception e) {
			System.exit(1);
		}
	}
}

