package Aplicação;

import java.util.Scanner;

import entidades.Estoque;

public class Atv2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		Estoque product = new Estoque();
		
		System.out.println("Bem vindo ao estoque: Insira o nome, "
				+ "preço e quantidade do produto");
		System.out.println("nome: ");
		product.nome=sc.next();
		System.out.println("Preço: ");
		product.preco=sc.nextDouble();
		System.out.println("Quantidade: ");
		product.qtd=sc.nextInt();
		
		
		
		System.out.println();
		System.out.println("Dados do produto: "+product);
		
		System.out.println("Deseja adcionar produtos ao estoque?");
		
		int qtd=sc.nextInt();
		product.addProduct(qtd);
		System.out.println("Dados atualizados"+product);
		
        System.out.println("Deseja remover produtos do estoque?");
		
		qtd=sc.nextInt();
		product.removeProduct(qtd);
		System.out.println("Dados atualizados"+product);

	}

}
