package Java;

import java.util.Scanner;

public class exSoma {
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			int x;
			int y;
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			int soma = x + y;
			
			System.out.printf("SOMA = %d", soma);
		}
		
	}
}
