
public class MetodoSeparacaoMedioResposta {

	public static void main(String[] args) {
		// Lista de produtos vendidos (usando um array fixo)
		double[] vendas = { 150.00, 200.00, 50.00, 120.00, 300.00 };

		double totalVendas = calcularTotalVendas(vendas);
		double desconto = calcularDesconto(totalVendas);
		double valorDesconto = totalVendas * desconto;
		double totalComDesconto = totalVendas - valorDesconto;
		double valorImposto = calcularImposto(totalComDesconto);
		double totalFinal = totalComDesconto + valorImposto;

		exibirRelatorio(totalVendas, valorDesconto, totalComDesconto, valorImposto, totalFinal);
	}

	// Método para calcular o total de vendas
	public static double calcularTotalVendas(double[] vendas) {
		double total = 0;
		for (double venda : vendas) {
			total += venda;
		}
		return total;
	}

	// Método para calcular o desconto com base no total de vendas
	public static double calcularDesconto(double totalVendas) {
		if (totalVendas >= 500) {
			return 0.10; // 10% de desconto
		} else if (totalVendas >= 200) {
			return 0.05; // 5% de desconto
		}
		return 0; // Nenhum desconto
	}

	// Método para calcular o imposto com base no total com desconto
	public static double calcularImposto(double totalComDesconto) {
		double imposto = 0.15; // 15% de imposto
		return totalComDesconto * imposto;
	}

	// Método para exibir o relatório com os resultados
	public static void exibirRelatorio(double totalVendas, double valorDesconto, double totalComDesconto,
			double valorImposto, double totalFinal) {
		System.out.println("Total de Vendas: " + totalVendas);
		System.out.println("Desconto aplicado: " + valorDesconto);
		System.out.println("Total com desconto: " + totalComDesconto);
		System.out.println("Imposto sobre o total: " + valorImposto);
		System.out.println("Total final após imposto: " + totalFinal);
	}
}
