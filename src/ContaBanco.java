import java.util.Scanner;

public class ContaBanco {
    public static void main(String [] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o seu nome: ");
        contaTerminal.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        contaTerminal.agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        contaTerminal.numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o seu saldo: ");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("Olá " +
                contaTerminal.nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                contaTerminal.agencia +
                ", conta " + contaTerminal.numero +
                " e seu saldo " + contaTerminal.saldo +
                " já está disponível para saque");

    }

}
