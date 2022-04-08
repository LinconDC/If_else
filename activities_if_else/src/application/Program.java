package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Par ou Ímpar
		System.out.print("Insira um número: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Este número é par!");
		} else {
			System.out.println("Este número é ímpar!");
		}
		System.out.println();

		// Positivo ou negativo
		System.out.print("Digite um número positivo ou negativo: ");
		int dig = sc.nextInt();

		if (dig < 0) {
			System.out.println("Este número é negativo");
		} else {
			System.out.println("Este número é positivo!");
		}
		System.out.println();

		// Múltiplos entre si
		System.out.print("Insira 2 valores: ");
		int oneValue = sc.nextInt();
		int twoValue = sc.nextInt();

		if (oneValue % twoValue == 0 || twoValue % oneValue == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		sc.close();
	}

}
