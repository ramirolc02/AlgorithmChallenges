package ex441;
import java.io.BufferedInputStream;
import java.util.Scanner;
public class contar_out {
    public static void suma( char[] cadena, StringBuilder out) {
		int i = cadena.length - 1;
		while(i > -1) {
			if(cadena[i] != '.') {
			        if( cadena[i]=='9') {
                        cadena[i] = '0';
                        if(i==0) {
                            if(cadena.length == 3){
								out.append("1.");
								out.append(String.valueOf(cadena));
                           //     return "1." + String.valueOf(cadena);
                            }
                            else if(cadena.length > 4 && cadena[3]=='.'){
								out.append("1.");
								out.append(String.valueOf(cadena));
                               // return "1." + String.valueOf(cadena);
                            }
                            else{
								out.append("1");
								out.append(String.valueOf(cadena));
                               //return "1" + String.valueOf(cadena);
                            }
                        }
                    }else  {
						cadena[i]++;
                       out.append(String.valueOf(cadena));
                       break;
			        }
                }
            i--;
		}
		out.append("\n");
	// 	return String.valueOf(cadena);
	}
	public static void main(String[] args) {
		char[] cadena;
		try(Scanner s = new Scanner(new BufferedInputStream(System.in, 1*1024)))
		{
			while(s.hasNext()) 
			{
				StringBuilder out = new StringBuilder();
				cadena = s.nextLine().toCharArray();
				//System.out.println(suma(cadena,out));
				suma(cadena,out);
				System.out.print(out);
			}
		}
		catch(Exception e) {
			System.exit(1);
		}
	}
}
