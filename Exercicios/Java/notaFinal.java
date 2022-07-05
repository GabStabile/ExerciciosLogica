/* Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestre de uma disciplina anual.
 * Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
 * seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos os valores devem ter uma casa decimal.
 */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class notaFinal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double calc = nota1 + nota2;
		
		if (calc >= 60.00) {
			System.out.printf("NOTA FINAL = %.2f", calc);
		}
		else if (calc <= 60.00) {
			System.out.printf("NOTA FINAL = %.2f", calc);
			System.out.println("REPROVADO");
		}
		sc.close();
	}
}
