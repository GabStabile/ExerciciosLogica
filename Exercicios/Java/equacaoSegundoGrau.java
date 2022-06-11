package Java;

public class equacaoSegundoGrau {

	public static void main(String[] args) {
		
		int a = 0;
		int c = 0;
		double b = 0;
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 *a);
		
		System.out.println(x1);
		System.out.println(x2);
	}
}
