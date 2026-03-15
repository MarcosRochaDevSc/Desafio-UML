public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.selecionarMusica("Total Eclipse Of The Heart - Bonnie Tyler");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("48999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
