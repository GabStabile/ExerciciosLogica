/* 
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package Java;

import java.util.Scanner;

public class duracaoJogo {
	
	public static void main(String[] args, int duracao) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		
		if (horaInicial < horaFinal) {
			 duracao = horaFinal - horaInicial;
		} else {
			 duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
	}
}
