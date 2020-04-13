package Exercicios;

public class Exer2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		while (x < 5) {

			x = x + 1;
			y = y + x;

			System.out.println(x + " " + y + " ");
			x = x + 1;
		}

	}
}