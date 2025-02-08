package imc;

import java.util.Scanner;

public class ImcFinal {

	public static void calcular() {
		Scanner sc = new Scanner(System.in);
		double massa;
		double altura;
		double resultado;

		System.out.println("Informe sua massa: ");
		massa = sc.nextDouble();

		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();

		resultado = massa / (altura * altura);
		System.out.println("Seu IMC é: " + resultado);
	}
}
