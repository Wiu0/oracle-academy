package br.com.gerandofalcoes.turma7.exercicio;

import java.util.Scanner;
public class OrcamentoResposta {
	
	static Scanner sc = new Scanner(System.in);

	public static void apresentarMenuInicial() {
		System.out.println("Orcamento mensal da Ana");
	}

	public static String pegarMes() {
		System.out.print("Informe o mês: ");
		String mes = sc.next();
		return mes;
	}

	public static int pegarQuantidadeDespesas(String mes) {
		System.out.println("Informe a qtd despesas em " + mes + ":");
		int qtd = sc.nextInt();
		return qtd;
	}

	public static double pegarValorDespesa(int qtdDespesas) {
		double valorTotalDespesa = 0;

		for (int i = 1; i <= qtdDespesas; i++) {
			System.out.println("Informe o valor da despesa " + i);
			double valorDespesaDigitada = sc.nextDouble();
			valorTotalDespesa += valorDespesaDigitada;
		}
		return valorTotalDespesa;
	}
	
	public static double pegarValorRenda() {
		System.out.println("Informe a renda:");
		double valorRenda = sc.nextDouble();
		return valorRenda;
	}

	public static double calcularOrcamento(double vlrTotRenda, double vlrTotDesp) {
		double valorOrcamentoMes = vlrTotRenda - vlrTotDesp;
		return valorOrcamentoMes;
	}
	
	public static void mostrarResultado(double r, double d) {
		double o = calcularOrcamento(r, d);
		if(o > 0) {
			System.out.println("Sobrou: " + o);
		} else if (o < 0) {
			System.out.println("Faltou: " + o);
		} else {
			System.out.println("Zerou");
		}
	}
	
	public static void main(String[] args) {
		apresentarMenuInicial();
		String mes = pegarMes();
		int quantidadeDespesas = pegarQuantidadeDespesas(mes);
		double valorTotalDespesas = pegarValorDespesa(quantidadeDespesas);
		double valorTotalRenda = pegarValorRenda();
		mostrarResultado(valorTotalRenda, valorTotalDespesas);
	}	
}
