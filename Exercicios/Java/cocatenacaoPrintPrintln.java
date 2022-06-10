/*
	Cocatenar varios elementos em um mesmo comando de escrita
	Regra geral para print e println (println quebra linha de texto):
*/

package exercicios;
import java.util.Locale;

public class cocatenacaoPrintPrintln {
	
	public static void main(String[] args) {
		
		double x = 10.4353;
		
		System.out.println(x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("RESULTADO = " + x + " METROS" );
	}
	
}
