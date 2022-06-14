/* 
* Fazer um programa para ler o codigo de uma peca 1, o numero de pecas 1, o valor unitario de cada peca 1, o
* codigo de uma peca 2, o numero de pecas 2 e o valor unitario de cada peca 2. Calcule e mostre o valor a ser 
* pago. 
*/

package Java;

import java.util.Locale;
import java.util.Scanner;

public class exPecas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt(); //codigo do funcionario
		int nump1 = sc.nextInt();
		double valp1 = sc.nextDouble();
		
		sc.nextInt(); //codigo do funcionario
		int nump2 = sc.nextInt();
		double valp2 = sc.nextDouble();
		
		double calc1 = (nump1 * valp1);
		double calc2 = (nump2 * valp2);
		
		double total = (calc1 + calc2);
		
		System.out.printf("VALOR A PAGAR R$ %.2f", total);
	
		sc.close();
	}

}
