/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
 * A seguir, calcule e mostre o valor da conta a pagar.
 */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class precoProduct {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double codigoItem = sc.nextDouble();
		double qtdItem = sc.nextDouble();
		double calc = 0;
		
		if (codigoItem == 1) {
			calc = qtdItem * 4.00;
		}
		
		else if (codigoItem == 2) {
			calc = qtdItem * 4.50;
		}
		
		else if (codigoItem == 3) {
			calc = qtdItem * 5.00;
		}
		
		else if (codigoItem == 4) {
			calc = qtdItem * 2.00;
		}
		
		else if (codigoItem == 5) {
			calc = qtdItem * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f", calc);
		
		sc.close();
	}
}
