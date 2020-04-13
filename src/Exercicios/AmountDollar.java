package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AmountDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o preço do dolar?");
		double dollarPrice = sc.nextDouble();
		System.out.println("Qual valor de dolares que você quer");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor convertido em reais = %.2f%n", result);

		sc.close();
	}

}
