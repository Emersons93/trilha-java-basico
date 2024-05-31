import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine();  // Consumir a nova linha

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = sc.nextDouble();

        // Exibindo a mensagem com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}