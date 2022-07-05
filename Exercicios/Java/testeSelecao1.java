/*
 * Leia 4 valores inteiros A, B, C e D. Então se B for maior que C e D for maior que A e se a soma de C e D for maior 
 * que a soma de A e B e se C e D forem valores positivos e se A for par, escreva a mensagem “Valores aceitos” . 
 * Caso contrario, escreva a mensagem “Valores nao aceitos” (Valores nao aceitos).
 * Mostre a mensagem correspondente após a validacao dos valores​​.
 */

package Java;

import java.util.Scanner;

public class testeSelecao1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		scan.nextInt();
		scan.nextInt();
		scan.nextInt();
		
		if ((A % 2) == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		scan.close();
	}
}
