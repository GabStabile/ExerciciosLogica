/* 
 * Fazer um programa que leia tres valores com ponto flutuante de dupla preciso: A, B e C. Em seguida, calcule e mostre:
 * a) a Area do triangulo retangulo que tem A por base e C por altura.
 * b) a Area do circulo de raio C. (pi = 3.14159)
 * c) a Area do trapezio que tem A e B por bases e C por altura.
 * d) a Area do quadrado que tem lado B.
 * e) a Area do retangulo que tem lados A e B. 
*/

package Java;

import java.util.Locale;
import java.util.Scanner;

public class exCalcFormas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
				
		double TRIANGULO = (A * C / 2);
		double CIRCULO = (C * C * pi );
		double TRAPEZIO = (A + B) * (C) / 2;
		double QUADRADO = (B * B);
		double RETANGULO = (A *B);
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
		
		sc.close();
	}
}