import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("********Conta bancária*******");
        System.out.println();

        System.out.println("Por favor,digite o número da conta");
        numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Informe o número da agência");
        agencia = scanner.nextLine();

        System.out.println("Informe o seu nome");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta");
        saldo = scanner.nextDouble();


        System.out.println();
        
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " sua conta é " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
    }
}
 