
/*
 * Cenário:
Suponha que você tenha um sistema de gestão de estoque de uma loja e queira calcular o valor total em estoque com base nos preços e quantidades dos produtos. Além disso, você aplica um desconto dependendo do valor total do estoque, e depois calcula o imposto sobre o valor com desconto.

Requisitos:
Produto: Cada produto tem um preço e quantidade.
Desconto: O desconto será calculado conforme o valor total do estoque:
10% de desconto se o valor total for superior a 1000.
5% de desconto se o valor total for superior a 500.
Sem desconto se o valor total for menor que 500.
Imposto: Um imposto de 15% sobre o valor após o desconto.
Relatório: O sistema deve exibir um relatório com os totais calculados.
 */
public class MetodoSeparacaoDificil {

	public static void main(String[] args) {
		// Array de preços e quantidades dos produtos
		double[] precos = { 150.00, 200.00, 50.00, 120.00, 300.00 };
		int[] quantidades = { 5, 3, 10, 7, 2 };

		// 1. Calcular o total de estoque (preço * quantidade para cada produto)
		double totalEstoque = 0;
		for (int i = 0; i < precos.length; i++) {
			totalEstoque += precos[i] * quantidades[i];
		}

		// 2. Aplicar desconto baseado no valor total do estoque
		double desconto = 0;
		if (totalEstoque > 1000) {
			desconto = 0.10; // 10% de desconto para valores acima de 1000
		} else if (totalEstoque > 500) {
			desconto = 0.05; // 5% de desconto para valores acima de 500
		}

		double valorDesconto = totalEstoque * desconto;
		double totalComDesconto = totalEstoque - valorDesconto;

		// 3. Calcular o imposto sobre o total com desconto
		double imposto = 0.15; // 15% de imposto sobre o valor com desconto
		double valorImposto = totalComDesconto * imposto;
		double totalFinal = totalComDesconto + valorImposto;

		// 4. Exibir o relatório
		System.out.println("Relatório de Estoque:");
		System.out.println("---------------------");
		System.out.println("Total em estoque (sem desconto): " + totalEstoque);
		System.out.println("Desconto aplicado: " + valorDesconto);
		System.out.println("Total com desconto: " + totalComDesconto);
		System.out.println("Imposto sobre o total com desconto: " + valorImposto);
		System.out.println("Total final após imposto: " + totalFinal);

	}
}
