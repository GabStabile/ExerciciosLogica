package Java;

import java.util.Scanner;

public class entradaDadosVariosTipos {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String x;
			int y;
			double z;
			
			x = sc.next();
			y = sc.nextInt();
			z = sc.nextDouble();
			
			System.out.println("Dados digitados: ");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
}
