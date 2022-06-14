/* Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, 
 * bem como o valor do metro quadrado do terreno com duas casas decimais. 
 * Em seguida, o programa deve mostrar o valor da area do terreno, 
 * bem como o valor do preco do terreno, ambos com duas casas decimais.
*/

package Java;

import java.util.Locale;
import java.util.Scanner;

public class exMedLargTerreno {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double comprimento = sc.nextDouble();
		double largura = sc.nextDouble();
		double valor = sc.nextDouble();
		
		double AREA = (largura * comprimento);
		
		double preco = (AREA * valor);
		
		System.out.println("AREA = " + AREA);
		System.out.println("PRECO = " + preco);
		
		sc.close();
	}
}
