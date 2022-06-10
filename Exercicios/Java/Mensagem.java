public class Mensagem {

    public static void obterMensagem(int hora){
//a classe nesse caso, mostra a hora de acordo com o horário do dia
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                //o parâmetro é que das 5h as 12h, dará "Bom Dia"
                mensagemBomdia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Inválida.");
                break;
            }
        }

        public static void mensagemBomdia() {
            System.out.println("Bom dia!");
        }

        public static void mensagemBoaTarde() {
            System.out.println("Boa tarde!");
       }

        public static void mensagemBoaNoite() {
            System.out.println("Boa noite!");
        }
}


