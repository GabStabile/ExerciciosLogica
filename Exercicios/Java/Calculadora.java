package Java;

//Classe de exemplo para o exercico da aula 1 de Metodos

public class calculadora {

    public static void soma(double numero1, double numero2) {
//soma é o método
        double resultado = numero1 + numero2;

        System.out.println("A soma de "+ numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
//1 - recebe os numeros
        double resultado = numero1 - numero2;
//2 - executa a subtracao e armazena na avariavel temporaria (resultado)
        System.out.println(" A subtracao de " + numero1 + " menos " + numero2 + " ao " + resultado);
//E mostra o resultado da subtração e assim por diante
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println(" A multiplicação de " + numero1 + " vezes " + numero2 + " ao " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println(" A multiplicacao de " + numero1 + " vezes " + numero2 + " ao " + resultado);
    }
}
