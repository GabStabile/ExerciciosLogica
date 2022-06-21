/* 
 * Praticando Switch Case.
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda,
 * e assim por diante). Escrever na tela o dia da semana correspondente.
 */

package Java;

import java.util.Scanner;

public class diasDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha/digite um dia da semana com numeros: ");
		System.out.println("---------------------------------------------");
		
		int dia = entrada.nextInt();
		System.out.println("----");
		
		switch (dia) {
		case 1:
			System.out.println("Dia da semena: domingo");
			break;
		case 2:
			System.out.println("Dia da semana: segunda");
			break;
		case 3:
			System.out.println("Dia da semana: terca");
			break;
		case 4:
			System.out.println("Dia da semana: quarta");
			break;
		case 5:
			dia = 5;
			System.out.println("Dia da semana: quinta");
			break;
		case 6:
			System.out.println("Dia da semana: sexta");
			break;
		case 7:
			System.out.println("Dia da semana: sabado");
		default:
			System.out.println("Dia da semana: valor invalido");
		}
		
		entrada.close();
	}
}
