package Aplicação;

import java.util.Scanner;

import entidades.Notas;

public class atv5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome e as suas tres notas!");
		String nome;
		Float n1, n2, n3, media;

		System.out.println("Nome: ");
		nome = sc.next();
		System.out.printf("Nota 1: ");
		n1 = sc.nextFloat();
		System.out.printf("Nota 2: ");
		n2 = sc.nextFloat();
		System.out.printf("Nota 3: ");
		n3 = sc.nextFloat();

		Notas aluno = new Notas(nome, n1, n2, n3);
		media = aluno.getMedia();
		System.out.println("Nota Final: " + String.format("%.2f", media));
		if (media >= 60) {
			System.out.println("Aprovado :) ");
		} else {
			System.out.println("Reprovado :( ");
			Float faltam = 60 - media;
			System.out.println("Faltaram " + String.format("%.2f", faltam) + " pontos");
		}

	}

}
