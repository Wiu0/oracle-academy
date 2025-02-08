package br.com.gerando.falcoes.turma7.switchcase;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma nota de 0 a 3 para minha apresentacao");
		System.out.println("0 - MANDOU MAL");
		System.out.println("1 - FEZ");
		System.out.println("2 - MANDEI BEM");
		System.out.println("3 - FOI FODA!");
		int nota = 0;
		String textoNota = "";
		nota = sc.nextInt();
		
		switch (nota) {
		case 0:
			textoNota = "Mandou mal ;(";
			break;
		case 1:
			textoNota = "Fez -.-";
			break;
		case 2:
			textoNota = "Mandou bem :)";
			break;
		case 3:
			textoNota = "Foi foda :D";
			break;
		default:
			textoNota = "Valor invalido";
		}
		System.out.println("Parabens vc " + textoNota);
		sc.close();
	}
}
