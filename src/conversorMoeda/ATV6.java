package Aplicação;

import java.util.Scanner;

import entidades.ConversorMoeda;

public class ATV6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos dolares voce deseja comprar?");
		double comprarDolar, cotacaoD;
		System.out.printf("Quero comprar: ");
		comprarDolar=sc.nextDouble();
		System.out.println("Qual a cotacao do dolar hoje?");
		System.out.printf("Cotacao dolar hoje: ");
		cotacaoD=sc.nextDouble();
		
		ConversorMoeda conversor= new ConversorMoeda(comprarDolar, cotacaoD);
		double valorFinal = conversor.valorPagamento();
		
		System.out.printf("O valor a ser pago em reias = %.2f%n", valorFinal);

	}

}
