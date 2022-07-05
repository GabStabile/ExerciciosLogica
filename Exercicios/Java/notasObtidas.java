/*
 * Obs: Realizei algumas alteracoes no code para ficar mais legivel e vizualmente mais confortavel no console. 
 * Leia quatro numeros (N1 , N2 , N3 , N4), sendo aquele com 1 digito apos a virgula, correspondendo a 4 notas obtidas 
 * por um aluno. Calcule a media com pesos 2, 3, 4 e 1 respectivamente, para essas 4 pontuacoes e imprima a mensagem "M�dia:" 
 * (Media), seguida do resultado calculado. Se a media foi 7,0 ou mais, imprima a mensagem "Aluno aprovado". 
 * (Aluno aprovado). Se a media foi inferior a 5,0, imprima a mensagem: "Aluno reprovado". 
 * (Aluno Reprovado). Se a media ficou entre 5,0 e 6,9, incluindo estes, o programa deve imprimir a mensagem "Aluno em exame". 
 * (Estudante em exame).
 */

package Java;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class notasObtidas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0");
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		
		double media = (((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10);
		System.out.println("Media = " + df.format(media));
		
		if (media >= 7.0) {
			System.out.println("Situacao: Aluno aprovado");
		}
		else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			System.out.println("");
			System.out.println("Digite a nota do exame abaixo:");
			double exame = sc.nextDouble();
			System.out.println("");
			System.out.println("Nota do exame: "+ df.format(exame));
			double media2 = ((media + exame) / 2);
			if (media2 > 5.0) {
				System.out.println("Situacao: Aluno aprovado!");
			} else {
				System.out.println("Situacao: Aluno reprovado!");	
			}
			System.out.println("Media final: " + df.format(media2));
		 } else {
	        	System.out.println("Aluno reprovado.");
		 }
		sc.close();
	}
}
