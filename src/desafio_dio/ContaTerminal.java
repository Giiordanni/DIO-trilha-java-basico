package desafio_dio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    
        System.out.println("Vamos entrar na sua conta!");
        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Número da conta: ");
        int numeroCont = sc.nextInt();
        sc.nextLine();
        System.out.print("Agencia: ");
        String agencia = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!" , nomeCliente, agencia, numeroCont, saldo);


	}

}
