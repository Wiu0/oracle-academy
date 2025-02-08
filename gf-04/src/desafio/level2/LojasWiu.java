package desafio.level2;

import java.util.Scanner;

public class LojasWiu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		double[] precos = usarIfParaCapturarValores(sc);
		double[] precos;
		double[] precosPreSelecionado = {2000.32, 3, 500_000.11};
		
		System.out.println("Esses sao os produtos da minha loja:\n0. TV\n1. Lapis\n2. Casa");
		System.out.println("Quantos produtos voce deseja?");
		
		int qtdProdComprar = sc.nextInt();
		precos = new double[qtdProdComprar];
		
		int opcaoSelecionada;
		for(int i = 0; i < qtdProdComprar; i++) {
			System.out.println("Digite o codigo do produto " + i);
			opcaoSelecionada = sc.nextInt();
			precos[i] = precosPreSelecionado[opcaoSelecionada];
		}
		
		calcularTotalProdutos(precos);
		
		sc.close();
	}


	private static double[] usarIfParaCapturarValores(Scanner sc) {
		double precos[];
		
		//1- 2000.00, 2- Lapis 3.0, 3- 500,000.000
		System.out.println("Esses sao os produtos da minha loja:\n1. TV\n2. Lapis\n3. Casa");
		
		System.out.println("Quantos produtos voce deseja?");
		
		int quantidadeProdutosQueUsuarioDesejaComprar = sc.nextInt();
		precos = new double[quantidadeProdutosQueUsuarioDesejaComprar];
		
		int opcaoSelecionada;
		for(int i = 0; i < quantidadeProdutosQueUsuarioDesejaComprar; i++) {
			System.out.println("Digite o codigo do produto " + i);
			opcaoSelecionada = sc.nextInt();
			if(opcaoSelecionada == 1) {
				precos[i] = 2000.00;
 			}else if(opcaoSelecionada == 2) {
 				precos[i] = 3.0;
			}else if(opcaoSelecionada == 3) {
				precos[i] = 500_000.00;
			}else {
				System.out.println("Nao tenho esse produto");
				i--;
			}
		}
		return precos;
	}
	
	
	static void calcularTotalProdutos(double produtos[]) {
		double totalPrecoProdutos = 0;
		//Ir posicao por posicao do array, pegar o preco daquela posicao, somar em um totalizador
		//finalizar e imprimir o total
		for(int i = 0; i < produtos.length; i++) {
			totalPrecoProdutos = totalPrecoProdutos + produtos[i];
		}
		
		System.out.println(totalPrecoProdutos);
	}
}
