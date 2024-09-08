package Aplicação;

import java.util.Scanner;

import entidades.Funcionario;

public class Atv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Double salarioBruto, taxa, percentual;
		System.out.println("Insira seu nome, salario e imposto: ");
		System.out.printf("Nome: ");
		nome = sc.next();
		System.out.printf("Salario bruto: ");
		salarioBruto=sc.nextDouble();
		System.out.printf("Imposto: ");
		taxa=sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salarioBruto, taxa);

		System.out.println("Funcionario: "+funcionario);
		System.out.println("Qual a porcentagem para aumentar o salario?");
		double Percentual=sc.nextDouble();
		funcionario.reajusteSalario(Percentual);
		
		System.out.println("Dados atualizados: "+ funcionario);
	}

}
