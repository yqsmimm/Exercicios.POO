package Aplicação;

import java.util.Scanner;
import entidades.contaBancaria;

public class Atv7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		contaBancaria conta;
		String nomeTitular;
		double depositoInicial;
		int numeroConta;
		System.out.println("Informe o numero da conta, nome do titular e o valor do deposito inicial");
		System.out.printf("Numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.printf("Nome do titular: ");
		sc.nextLine();
		nomeTitular = sc.nextLine();
		System.out.printf("Havera um deposito inicial?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Deposito inicial:");
			depositoInicial = sc.nextDouble();
			conta = new contaBancaria(nomeTitular, numeroConta, depositoInicial);
		} else {
			conta = new contaBancaria(nomeTitular, numeroConta);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
	    System.out.println();
		System.out.println("Informe um valor de deposito: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Informe um valor de saque: ");
		valor = sc.nextDouble();
		conta.sacar(valor);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
	}
	
}
