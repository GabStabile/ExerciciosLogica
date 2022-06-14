/* Leia os valores de dois pontos flutuantes de precisao dupla A e B, correspondentes as notas de dois alunos. 
 * Apos isso, calcule a media do aluno, considerando que a nota A tem peso 3,5 e B tem peso 7,5. 
 * Cada nota pode ser de zero a dez, sempre com um degito apos a virgula. Nao se esqueca de imprimir o final da linha apos o resultado, 
 * caso contrario voce recebera "Erro de apresentacao" . 
 * Nao se esqueca do espaco antes e depois do sinal de igual.
 */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class exMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();		
		
		double calc = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f", calc);
		
		sc.close();
	}
}
