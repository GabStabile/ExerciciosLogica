/* Leia três valores (variáveis ​​A, B e C), que são as notas dos três alunos. Em seguida, 
 * calcule a média, considerando que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
 * Considere que cada nota pode ir de 0 a 10,0, sempre com uma casa decimal.
 */

package Java;

import java.util.Scanner;

public class exMedia2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double calc = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f", calc);
		
		sc.close();
	}
}
