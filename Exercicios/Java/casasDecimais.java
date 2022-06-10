package exercicios;
import java.util.Locale;

// praticando formatacao de casas decimais

public class casasDecimais {

	public static void main(String[] args) {
		
		double x = 10.4353;
		
		System.out.println(x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
	}

}
