public class Iphone implements ReprodutorMusical, Internet, Telefone {

    @Override
    public void tocar() {
        System.out.println("Iniciando a reprodução da música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a reprodução da música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Métodos da interface Internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Métodos da interface Telefone
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
