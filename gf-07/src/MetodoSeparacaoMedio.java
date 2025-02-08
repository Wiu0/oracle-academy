
/*
 * Agora, vamos criar um exemplo de código mais complexo, que 
 * envolva várias etapas de processamento e tomada de decisão. 
 * Nesse exemplo, simula-se um sistema de gestão de vendas onde realizamos 
 * algumas operações como calcular o total de vendas, aplicar descontos 
 * baseados em faixas de valores e calcular o imposto sobre o total de 
 * vendas.
 */
public class MetodoSeparacaoMedio {
	public static void main(String[] args) {
		// Lista de produtos vendidos (usando um array fixo)
		double[] vendas = { 150.00, 200.00, 50.00, 120.00, 300.00 };

		// 1. Calcular o total de vendas
		double totalVendas = 0;
		for (double venda : vendas) {
			totalVendas += venda;
		}

		// 2. Aplicar desconto baseado no valor total
		double desconto = 0;
		if (totalVendas >= 500) {
			desconto = 0.10; // 10% de desconto para vendas acima de 500
		} else if (totalVendas >= 200) {
			desconto = 0.05; // 5% de desconto para vendas acima de 200
		}

		double valorDesconto = totalVendas * desconto;
		double totalComDesconto = totalVendas - valorDesconto;

		// 3. Calcular o imposto sobre o total com desconto
		double imposto = 0.15; // 15% de imposto sobre o valor com desconto
		double valorImposto = totalComDesconto * imposto;
		double totalFinal = totalComDesconto + valorImposto;

		// 4. Exibir o relatório
		System.out.println("Total de Vendas: " + totalVendas);
		System.out.println("Desconto aplicado: " + valorDesconto);
		System.out.println("Total com desconto: " + totalComDesconto);
		System.out.println("Imposto sobre o total: " + valorImposto);
		System.out.println("Total final após imposto: " + totalFinal);
	}
}
