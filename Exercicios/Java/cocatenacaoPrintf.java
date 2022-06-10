/*
	Cocatenar varios elementos em um mesmo comando de escrita
	Regra geral para printf:
*/

package exercicios;

public class cocatenacaoPrintf {
	
	public static void main(String[] args){
		
		String nome = "GabStabile";
		int idade = 41;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}					
}
