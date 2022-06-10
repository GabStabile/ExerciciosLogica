package Java;

import java.util.Locale;

public class fixacaoEx {
	
	public static void main(String[] args){
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.23456700;
		
		System.out.println("Product:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2);
		System.out.println(); // Pulando linha
		System.out.printf("Record: %d years old, code %d and gerder: %s%n", age, code, gender);
		System.out.println(); // Pulando linha
		System.out.printf("Meausue with eight decimal places: %f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
