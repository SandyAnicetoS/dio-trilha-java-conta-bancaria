import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente");
        String nome = scanner.nextLine(); // permitindo duas palavras separadas por espaço

        System.out.println("Por favor, digite o número da conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite a agência");
        String agencia = scanner.next();

        System.out.println("Por favor, informe seu saldo");
        double saldo = scanner.nextDouble();

        // explorando as formas de concatenação
        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ")
            + conta + " e seu saldo " + saldo + " já está disponivel pra saque.");
    }   
}
