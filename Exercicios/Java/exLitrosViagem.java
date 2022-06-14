/* O Joaozinho quer calcular e mostrar a quantidade de litros de combustivel gasto em uma viagem, 
 * usand o um carro que faz 12 Km/L. Para isso, ele gostaria que voce o ajudasse atraves de um programa simples. 
 * Para realizar o calculo, o necessario ler o tempo gasto (em horas) e a mesma velocidade media (km/h). 
 * Desta forma, voce pode obter a distancia e, em seguida, calcular quantos litros seriam necessarios. 
 * Mostre o valor com tres casas decimais apos o ponto.
 */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class exLitrosViagem {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int gh = sc.nextInt();
		int media = sc.nextInt();
		
		double calc = gh * media;
		double QtdLitros = calc / 12;
		
		System.out.printf("%.3f", QtdLitros);
		
		sc.close();
	}
}
