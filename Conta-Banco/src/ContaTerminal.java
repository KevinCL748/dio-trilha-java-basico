import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando um scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Lendo dados do usuário
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();  // Lê o número da conta
        
        scanner.nextLine();  // Consome a quebra de linha deixada pelo nextInt()
        
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();  // Lê o número da agência
        
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();  // Lê o nome do cliente
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();  // Lê o saldo da conta
        
        // Exibindo os dados informados
        System.out.println("\n--- Dados da Conta Bancária ---");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);

        // Fechando o scanner
        scanner.close();

        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque56");
    }

}
