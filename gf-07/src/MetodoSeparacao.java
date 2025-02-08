public class MetodoSeparacao {
	
	public static void main(String[] args) {
		
		// 1. Definir os dados
		double salario = 5000.00;
		double aumento = 0.10;
		double desconto = 0.05;
		// 2. Calcular aumento
		double valorAumento = salario * aumento;
		// 3. Calcular o novo salário após o aumento
		double salarioComAumento = salario + valorAumento;
		// 4. Calcular o desconto
		double valorDesconto = salarioComAumento * desconto;
		// 5. Calcular o salário final após o desconto
		double salarioFinal = salarioComAumento - valorDesconto;
		// 6. Exibir os resultados
		System.out.println("Salário original: " + salario); // 5000.0
		System.out.println("Aumento: " + valorAumento); // 500.0
		System.out.println("Salário com aumento: " + salarioComAumento); // 5500.0
		System.out.println("Desconto: " + valorDesconto); // 275.0
		System.out.println("Salário final após desconto: " + salarioFinal); //5225.0	
	}
	
}
