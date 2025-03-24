/* Funções:
 * Reprodutor virtual: tocar, pausar, selecionarMúsica
 * Aparelho Telefônico: ligar, atender, inciarCorreioVoz
 * Navegador na Internet: exibirPágina, adicioanrNovaAba, atualizarPagina
 */

public class Main {
    public static void main (String[] args) {
        IPhone iphone = new IPhone("1234", "15.0");
        iphone.ligar("123456");
        iphone.atender();
        iphone.selecionarMúsica("Billie Eilish");
        iphone.pausar();
    }
}