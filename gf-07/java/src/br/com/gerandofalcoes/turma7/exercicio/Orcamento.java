package br.com.gerandofalcoes.turma7.exercicio;
import java.util.Scanner;

public class Orcamento {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ola ana");
		System.out.println("Qual o mes?");
		
		String mes = sc.nextLine();
		System.out.println("Quantas Despesas em " + mes + "?");
		int quantidadeDespesas = sc.nextInt();
		double totalDespesas = 0;
		
		for(int i = 1; i <= quantidadeDespesas; i++) {
			System.out.println("Qual o valor da despesa " + i);	
			double valorDespesa = sc.nextDouble();
			totalDespesas += valorDespesa;
		}
		System.out.println("Total despesas " + totalDespesas);
		
		System.out.println("Renda do mes");
		double rendaMes = sc.nextDouble();
		
		double resto = rendaMes - totalDespesas;
		if(resto > 0) {
			System.out.println("Sobrou " + resto);			
		} else if(resto < 0) {
			System.out.println("Falta " + resto);
		} else {
			System.out.println("Cagada, deu zerado mesmo");
		}
		sc.close();
	}
}
