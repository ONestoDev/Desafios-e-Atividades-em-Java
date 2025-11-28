import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("Informe oo primeiro número: ");
		var numero1 = scanner.nextInt();
		System.out.print("Informe o segundo número: ");
		var numero2 = scanner.nextInt();
		System.out.printf("%s + %s = %s%n", numero1, numero2, numero1 + numero2);
	}

}