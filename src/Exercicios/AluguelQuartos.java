package Exercicios;

import java.util.Scanner;

import entities.Rent;

public class AluguelQuartos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("Quantos quartos você vai querer?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rend #" + i + ":");
			System.out.println("Digite seu nome");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite seu E-mail");
			String email = sc.nextLine();
			System.out.println("Digite o quarto");
			int quartos = sc.nextInt();
			vect[quartos] = new Rent(nome, email);

		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
