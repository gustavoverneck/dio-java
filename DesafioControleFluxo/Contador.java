import java.util.Scanner;
import java.util.Locale;


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

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}