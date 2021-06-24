package multiprogram;

import java.util.Scanner;

public class SuperPrograma {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SuperPrograma sp = new SuperPrograma();
		
		sp.sc.next();
		sp.apresentarMenuDeOpcoes();
		sp.calcularDespesas();
		sp.calcularMediaNotas();
	}

	 void apresentarMenuDeOpcoes() {

		System.out.println("Qual opcao vc deseja executar?");
		System.out.println("1- Despesas da casa");
		System.out.println("2- Media de idade da casa");
		System.out.println("3- Media de notas");
		System.out.println("0- Sair do programa");

		byte opcaoSelecionada = sc.nextByte();
		
		// Como executar so a opcao 1 ou 2 ou 3? => if/ if else/ if else if/ switch
		switch (opcaoSelecionada) {
		case 1:
			calcularDespesas();
			break;
		case 2:
			calcularMediaIdade();
			break;
		case 3:
			calcularMediaNotas();
			break;
		case 0:
			System.out.println("Saiu do programa");
			break;
		default:
			System.out.println("Codigo nao mapeado");
			break;
		}

		sc.close();
	}

	 void calcularMediaIdade() {
		int idadePai = sc.nextInt(), idadeMae = sc.nextInt(), idadeCrianca = sc.nextInt();
		int quantidadeIdades = sc.nextInt();
		int somatoria = idadePai + idadeMae + idadeCrianca;
		int mediaIdadeCasa = somatoria/quantidadeIdades;
		System.out.println("A idade media na casa que vc mora é " + mediaIdadeCasa + " anos");
	}
	
	 void calcularMediaNotas() {
		System.out.println("Quantas notas?");
		int qtdNotas = sc.nextInt();
		
		double notas[] = new double[qtdNotas];
		double somatoriaNotas = 0;
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("Informe a nota " + (i + 1));
			notas[i] = sc.nextDouble();
		}

		for(int i = 0; i < qtdNotas; i++) {
			somatoriaNotas = somatoriaNotas + notas[i];
		}
		
		System.out.println("Sua Média é: " + somatoriaNotas/qtdNotas);
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("Sua nota " + (i + 1) +  " foi " + notas[i]) ;
		}

	}
	
	void calcularDespesas() {
		double agua;
		double luz, transporte;
		double internet, gas, mercado;

		System.out.println("Informe o valor da conta de agua");
		agua = sc.nextDouble();
		System.out.println("Informe o valor da conta de luz");
		luz = sc.nextDouble();
		System.out.println("Informe o valor da conta de internet");
		internet = sc.nextDouble();
		System.out.println("Informe o valor da conta de gas");
		gas = sc.nextDouble(); 
		System.out.println("Informe o valor da conta de mercado");
		mercado = sc.nextDouble();
		System.out.println("Informe o valor da conta de transporte");
		transporte = sc.nextDouble();
	
		
		double totalDespesas = agua + luz + internet + gas + mercado + transporte;
		int quantidadeDespesas = 6;
		double valorMedioDespesas =  totalDespesas/quantidadeDespesas;

		System.out.println("Total de despesas: " + totalDespesas);
		System.out.printf("Total de despesas: %.2f \n", totalDespesas);
		System.out.printf("Valor médio das contas é %.2f", valorMedioDespesas);
	}
}
