package br.com.gerandofalcoes.turma7.exercicio;
import java.util.Scanner;

public class OrcamentoMensal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ola ana");
		System.out.println("mes?");
		String mes = sc.nextLine();
		System.out.println("Qtd Despesas no mes " + mes + "?");
		int quantidadeDespesas = sc.nextInt();
		double totalDespesa = 0;
		for(int i = 1;  i <= quantidadeDespesas; i++) {
			System.out.println("Despesas " + i);
			totalDespesa += sc.nextDouble();
		}
		System.out.println("Renda: ");
		double renda = sc.nextDouble();
		double resultado = 	renda - totalDespesa;
		
		if(resultado > 0) {
			System.out.println("deu bom " + resultado);
		} else if (resultado < 0) {
			System.out.println("deu ruim " + resultado);
		} else {
			System.out.println("Zerou na cagada");
		}
		sc.close();
	}
}
