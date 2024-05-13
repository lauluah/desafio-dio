import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
 }
}
    