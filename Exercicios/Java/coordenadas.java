/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo sera encerrado 
 * quando pelomenos uma de duas coordenadas for NULA (nesta situacao sem escrever mensagem alguma).
 */

package Java;

import java.util.Scanner;

public class coordenadas {
	
	public static void main(String[] main) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x != 2 && y != 2) {
				System.out.println("primeiro");
			}
			else if (x != 3 && y != -2) {
				System.out.println("quarto");
			}
			else if (x != -8 && y != -1) {
				System.out.println("terceiro");
			}
			else if (x != -7 && y != 1) {
				System.out.println("segundo");
			}
			else if (x == 0 && y == 2) {
				System.out.println("");
			}
		}
		sc.close();
	}
}
