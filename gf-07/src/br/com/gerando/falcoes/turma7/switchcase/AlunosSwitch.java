package br.com.gerando.falcoes.turma7.switchcase;
import java.util.Scanner;

public class AlunosSwitch {

	/*
	 * Desenvolver um programa que o usuario vai informar uma nota de 0 a 3 sobre a
	 * minha apresentacao 0 - Mandou mal 1 - Mandou mais ou menos 2 - Mandou bem 3 -
	 * Foddaaa imprima o texto A nota que vc deu foi : Mandou Mal
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		sc.close();
		String avaliacaoFinal = "";

		switch (nota) {
		case 0:
			avaliacaoFinal = "Mandou mal";
			break;
		case 1:
			avaliacaoFinal = "Mandou mais ou menos";				
			break;
		case 2:
			avaliacaoFinal = "Mandou bem";
			break;
		case 3:
			avaliacaoFinal = "Foda";
			break;
		default:
			avaliacaoFinal = "Valor invalido";
		}

		System.out.println(avaliacaoFinal);

	}
}
