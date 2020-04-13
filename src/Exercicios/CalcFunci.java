package Exercicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Funci;

public class CalcFunci {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		ArrayList<Funci> list = new ArrayList<>();

		System.out.println("Quantos funcion�rios ser�o registrados:=?");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println();
			System.out.println("Funci #" + i + ": ");
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Sal�rio: ");
			double salario = sc.nextDouble();
		}
		System.out.println();
		System.out.println("DIGITE A IDENTIFICA��O DO FUNCION�RIO QUE TER� AUMENTO");
		int id = sc.nextInt();

		Funci funci = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (funci == null) {
			System.out.println("Esse ID n�o existe");
		} else {
			System.out.println("Digite a porcentagem");
			double percentual = sc.nextDouble();
			funci.aumentoSalario(percentual);
		}
		System.out.println();
		System.out.println("Lista de Funcion�rios ");
		for (Object funcionario : list) {
			System.out.println(funcionario);
		}

	}

}
