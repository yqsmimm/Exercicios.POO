package Aplicação;

import java.util.Scanner;

import entidades.Retangulo;

public class Atv3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os valores da largura e altura do retangulo");
		Retangulo forma = new Retangulo();
		System.out.print("Largura: ");
		forma.largura = sc.nextDouble();
		System.out.println("Altura: ");
		forma.altura = sc.nextDouble();
		
		System.out.println(forma);
	}
	
	
}
