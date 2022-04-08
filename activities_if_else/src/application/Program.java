package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Par ou �mpar
		System.out.print("Insira um n�mero: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Este n�mero � par!");
		} else {
			System.out.println("Este n�mero � �mpar!");
		}
		System.out.println();

		// Positivo ou negativo
		System.out.print("Digite um n�mero positivo ou negativo: ");
		int dig = sc.nextInt();

		if (dig < 0) {
			System.out.println("Este n�mero � negativo");
		} else {
			System.out.println("Este n�mero � positivo!");
		}
		System.out.println();

		// M�ltiplos entre si
		System.out.print("Insira 2 valores: ");
		int oneValue = sc.nextInt();
		int twoValue = sc.nextInt();

		if (oneValue % twoValue == 0 || twoValue % oneValue == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}

		sc.close();
	}

}
