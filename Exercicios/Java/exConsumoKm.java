/* Calcule o consumo medio de um carro, fornecendo a distancia total percorrida (em Km) 
 * e o total de combustivel gasto (em litros).
 * */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class exConsumoKm {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int calc = (X * Y);  
		
		System.out.println("km/l" + calc);
		
		sc.close();	
	}

}
