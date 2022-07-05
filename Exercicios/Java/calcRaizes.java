/* 
 * Leia 3 valores de ponto flutuante e efetue o calculo das raizes da equacao de Bhaskara. 
 * Se nao for possivel calcular as raizes, mostre a mensagem correspondente "Impossivel calcular", 
 * caso haja uma divisao por 0 ou raiz de numero negativo.
 * Se nao houver possibilidade de calcular as raizes, apresente a mensagem "Impossivel calcular". Caso contrario, 
 * imprima o resultado das raizes com 5 digitos apos o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
 * Imprima sempre o final de linha apos cada mensagem.
 */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class calcRaizes {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * b;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b + Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		sc.close();	
	}
}
