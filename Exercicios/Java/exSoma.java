package Java;

import java.util.Scanner;

public class exSoma {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
			
		int soma = x + y;
			
		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}
}
