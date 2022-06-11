package Java;

public class operadoresMatematicos {
	
	public static void main(String[] args){
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		System.out.println("Calculo de raiz quadrada:");
		A = Math.sqrt(x); // square: raiz quadrada de um n�mero positivo
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);		
		System.out.println("Raiz quadrada de " + y + " = " + B);		
		System.out.println("Raiz quadrada de " + C);
		
		System.out.println();
		
		System.out.println("Calculo de elevacao da potencia:");
		A = Math.pow(x, y); // usado para calcular um aumento de n�mero � pot�ncia de algum outro n�mero
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		System.out.println();
		
		System.out.println("Calculo que retornar o valor absoluto de um n�mero:");
		A = Math.abs(y); // retorna o valor absoluto de um determinado argumento. Se o argumento n�o for negativo, o argumento ser� retornado.
		B = Math.abs(z); // Se o argumento for negativo, a nega��o do argumento � retornada.
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}
