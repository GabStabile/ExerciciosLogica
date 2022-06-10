package Java;

import java.util.Scanner;

public class entrataDadosNextLine {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String s1, s2, s3;
			
			s1 = sc.nextLine(); // next() l� a String at� o primeiro espa�o 
			s2 = sc.nextLine(); // enquanto nextLine() l� at� encontrar uma quebra de linha
			s3 = sc.nextLine();
			
			System.out.println("Dados digitados:");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		}
	}
}
