package Java;

import java.util.Locale;
import java.util.Scanner;

public class paisLisarb {
	
	public static void Main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salLis = sc.nextDouble();
		double imposto = 0;
		
		if (salLis >= 0.00 && salLis <= 2000.00) {
			System.out.println("Isento");
		} 
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		if (salLis >= 2000.01 && salLis <= 3000.00) {
			imposto = (salLis - 2000.00) * 0.08;
		}
		else if (salLis >= 3000.01 && salLis <= 4500.00) {
			imposto = (salLis - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salLis - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		sc.close();
	}
}
