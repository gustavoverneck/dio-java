public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String modelo;
    private String versaoIOS;

    public IPhone(String modelo, String versaoIOS) {
        this.modelo = modelo;
        this.versaoIOS = versaoIOS;
    }

    // Implementação de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMúsica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação de NavegadorInternet
    @Override
    public void exibirPágina() {
        System.out.println("Exibindo página...");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    };
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");

    };

}
