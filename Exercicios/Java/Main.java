public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Execute Calculadora");
        //Classe:Calculadora
        Calculadora.soma(2, 4);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensageiro
        System.out.println("Execute mensagem");
        //Classe:mensagem
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);
    }
}
