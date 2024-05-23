public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        // Métodos da interface ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        
        // Métodos da interface Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
        // Métodos da interface Telefone
        iphone.ligar();
        iphone.atender();
        iphone.IniciarCorreioVoz();
    }
}