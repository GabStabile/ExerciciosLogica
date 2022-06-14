package Java;

import java.util.Locale;
import java.util.Scanner;

public class exCalcSalario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int f = sc.nextInt();		
		int h = sc.nextInt();
		double sal = sc.nextDouble();
		double calc = (h * sal);
		
		System.out.printf("NUMBER = %d%n", f);
		System.out.printf("SALARY = U$ %.2f", calc);
		
		sc.close();
	}
}
