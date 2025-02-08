package br.com.gerandofalcoes.turma7.exercicio;
import java.util.Scanner;

public class RuaDistancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qtd Ruas?");
		int quantidadeRuas = sc.nextInt();
		double totalKM = 0;
		for(int i = 1;  i <= quantidadeRuas; i++) {
			System.out.println("Rua " + i);
			totalKM = totalKM + sc.nextDouble();
		}
		System.out.println(totalKM);
		sc.close();
	}
}
