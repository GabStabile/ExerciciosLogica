/* A empresa ABC decidiu dar um aumento salarial aos seus funcionarios, conforme tabela a seguir:
 * Salario	Taxa de reajuste
 * 0 - 400,00 (15%)
 * 400,01 - 800,00 (12%)
 * 800,01 - 1.200,00 (10%)
 * 1.200,01 - 2.000,00 (7%)
 * Acima de 2.000,00 (4%)
 * URI 1048
 */

package Java;

import java.util.Locale;
import java.util.Scanner;

public class aumentoSalario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 15%
		double sal = sc.nextDouble(); 
		double reajuste = sal * 0.15;
		if (sal >= 0 && sal <= 400.00) {
			double calc = sal + reajuste;
			System.out.println("Novo salario: " + calc);
			System.out.println("Reajuste ganho: " + reajuste);
			System.out.println("Em percentual: 15%");
		}
		// 12%
		double reajuste1 = sal * 0.12;
		if (sal >= 400.01 && sal <= 800.00) {
			double calc1 = sal + reajuste;
			System.out.println("Novo salario: " + calc1);
			System.out.println("Reajuste ganho: " + reajuste1);
			System.out.println("Em percentual: 15%");
		}
		// 10%
		double reajuste2 = sal * 0.10;
		if (sal >= 800.01 && sal <= 1.200) {
			double calc2 = sal + reajuste2;
			System.out.println("Novo salario: " + calc2);
			System.out.println("Reajuste ganho: " + reajuste2);
			System.out.println("Em percentual: 10%");
		}
		// 7%
		double reajuste3 = sal * 0.07;
		if (sal >= 1200.01 && sal <= 2000.00) {
			double calc3 = sal + reajuste3;
			System.out.println("Novo salario: " + calc3);
			System.out.println("Reajuste ganho: " + reajuste3);
			System.out.println("Em percentual: 7%");
		}
		// 4%
		double reajuste4 = sal * 0.04;
		if (sal >= 2000.00) {
			double calc4 = sal + reajuste4;
			System.out.println("Novo salario: " + calc4);
			System.out.println("Reajuste ganho: " + reajuste4);
			System.out.println("Em percentual: 4%");
		}
		sc.close();
	}
}
