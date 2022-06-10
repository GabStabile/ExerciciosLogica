/* 
 * Praticando Entrada de dados do tipo Double: Scanner.
 * */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class entradaDadosDouble {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // para a entrada sair com `.` deve-se importar Locale.
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Voce digitou: %.2f%n" + x);
		
		sc.close();
	}

}
