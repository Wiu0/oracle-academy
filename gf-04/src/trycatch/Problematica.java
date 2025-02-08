package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problematica {

	public static void main(String[] args) {
		System.out.println("Por favor digite um numero");
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				int idade = sc.nextInt();
				System.out.println(idade);
				return;
			} catch (InputMismatchException e) {
				System.out.println("Vc fez merda 1");

			} catch (NullPointerException e) {
				System.out.println("Vc fez merda 2");

			} finally {
				sc.nextLine();
				System.out.println("SEMPRE EXECUTA AQUI");
			}
			sc.close();
		}
	}
}
