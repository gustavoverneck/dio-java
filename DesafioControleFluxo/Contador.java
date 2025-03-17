import java.util.Scanner;
import java.util.Locale;


/**
 * A classe Contador fornece um método para contar de um número inteiro até outro,
 * printando cada número presente no intervalo. Os parâmetros são fornecidos pelo
 * usuário via input.
 */
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        terminal.nextLine();

        System.out.println("Insira o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        terminal.nextLine();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Os parâmetros são inválidos: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}

/**
 * Exception é lançada quando os parâmetros são invalidos.
 * A exceção indica que o primeiro parâmetro é maior que o segundo.
 * 
 * @param message Envia uma mensagem detalhando a exceção.
 */
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}