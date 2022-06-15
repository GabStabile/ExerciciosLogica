/* 
* Beecrowd: Notas - 1018
 * Neste problema você tem que ler um valor inteiro e calcular o menor número possível de notas em que o valor pode ser decomposto. 
 * As notas possíveis são 100, 50, 20, 10, 5, 2 e 1. 
 * Imprima o valor lido e a lista de notas.
 */


package Java;

import java.util.Scanner;

public class notasCalc {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int notas = sc.nextInt();

        int notas100 = notas / 100;
        notas -= notas100 * 100;

        int notas50 = notas / 50;
        notas -= notas50 * 50;
        
        int notas20 = notas / 20;
        notas -= notas20 * 20;
        
        int notas10 = notas / 10;
        notas -= notas10 * 10;
        
        int notas5 = notas / 5;
        notas -= notas5 * 5;
        
        int notas2 = notas / 2;
        notas -= notas2 * 2;
        
        int notas1 = notas / 1;
        notas -= notas1 * 1;
        
        System.out.print(notas);
        System.out.println(notas100 + " nota (s) de R$ 100,00");
        System.out.println(notas50 + " nota (s) de R$ 50,00");
        System.out.println(notas20 + " nota (s) de R$ 20,00");
        System.out.println(notas10 + " nota (s) de R$ 10,00");
        System.out.println(notas5 + " nota (s) de R$ 5,00");
        System.out.println(notas2 + " nota (s) de R$ 2,00");
        
        sc.close();
    }
}