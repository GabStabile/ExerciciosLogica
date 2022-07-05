/* Fazer um programa para ler tres numeros inteiros. Em seguida, mostrar qual o menor dentre os tres numeros lidos. Em caso 
 * de empate, mostrar apenas uma vez.
 */

package Java;

import java.util.Scanner;

public class qualMenorNumero {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x < y && x < z) {
			System.out.println("MENOR = " + x);
		}
		else if (y < x && y < z) {
			System.out.println("MENOR = " + y);
		}
		else if (z < y && z <= x) {
			System.out.println("MENOR = " + z);
		}
		else if (x == y && x == z) {
			System.out.println("MENOR = " + x);
		}
		sc.close();
	}
}
