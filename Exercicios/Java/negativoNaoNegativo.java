/*
 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este numero 
 * e negativo ou nao.
 */

package Java;

import java.util.Scanner;

public class negativoNaoNegativo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num <0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
	}
}
