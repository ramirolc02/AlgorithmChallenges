package ex304;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class euclidea {
    public static void main(String[] args) {
		try(Scanner s = new Scanner(new BufferedInputStream(System.in,1*1024)))
		{
			  int n,a,b,cociente=0,resto=0;
			  n=s.nextInt();
			  for (;n>0;n--){
				 a=s.nextInt();
				 b=s.nextInt();
			    if(b==0)
			    {
			      System.out.println("DIV0");
			      continue;
			    }
			    resto=a%b;
			    cociente=a/b;
			    if(resto < 0) {
			    	if(b<=0) {
			    		cociente++;
			    	}
			    	else {
			    		cociente--;
			    	}
			    	resto=a-b*cociente;
			    }
			    	    
			    System.out.println(cociente +" "+ resto);
			    cociente=0;
			    resto=0;
			}
		}
		catch(Exception e){
			System.exit(1);
		}
	}
}
