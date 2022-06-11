package Java;

import java.util.Locale;
import java.util.Scanner;

public class exRaioCirculo {
	
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = PI * Math.pow(2, raio);
		
		System.out.printf("A=%.4f", area);
	
		sc.close();
		
	}
}
