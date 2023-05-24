import java.util.*;

public class Edades {

	
	public static int calcularEdades (int[]array) {
		       
		        int contadorMenores = 0;
		        int contadorMayores = 0;
		        int contadorJubilados = 0;

		        for (int num : array) {
		            if (num > 18) {
		             contadorMayores += num;
		            }
		            
		            if (num < 18) {
		             contadorMenores += num;
		            }
		            
		            if (num > 65) {
		             contadorJubilados += num;
		            }
		            
		        }
				return contadorJubilados;
				
		 
		    }
		
}


