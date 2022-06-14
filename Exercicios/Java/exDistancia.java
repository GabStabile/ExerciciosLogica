package Java;

import java.util.Scanner;

public class exDistancia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		
		int calc = km * 2; 
		
		System.out.printf("%d minutos", calc);
		
		sc.close();
	}
}
