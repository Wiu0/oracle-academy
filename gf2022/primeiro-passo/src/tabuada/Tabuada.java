package tabuada;

import java.util.Scanner;

public class Tabuada {

	static Scanner sc = new Scanner(System.in);

	public static void calcular() {

		int numeroEscolhido;
		System.out.println("Informe o valor a ser calculado da tabuada: ");
		numeroEscolhido = sc.nextInt();
		for (int i = 0; i < 11; i++) {
			System.out.println(i + " x " + numeroEscolhido + " = " + (numeroEscolhido * i));
		}
	}

}
