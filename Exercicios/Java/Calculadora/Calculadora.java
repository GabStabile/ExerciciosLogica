//Classe de exemplo para o exercício da aula 1 de Métodos

public class Calculadora {

    public static void soma(double numero1, double numero2) {
//soma é o método
        double resultado = numero1 + numero2;

        System.out.println("A soma de "+ numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
//1 - recebe os números
        double resultado = numero1 - numero2;
//2 - executa a subtração e armazena na avariavel temporária (resultado)
        System.out.println(" A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
//E mostra o resultado da subtração e assim por diante
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println(" A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println(" A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }
}
