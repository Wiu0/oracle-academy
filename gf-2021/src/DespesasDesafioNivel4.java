import java.util.Scanner;

public class DespesasDesafioNivel4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		sc.close();
		
		double totalDespesas = agua + luz + internet + gas + mercado + transporte;
		int quantidadeDespesas = 6;
		double valorMedioDespesas =  totalDespesas/quantidadeDespesas;

		System.out.println("Total de despesas: " + totalDespesas);
		System.out.printf("Total de despesas: %.2f", totalDespesas);
		System.out.printf("Valor médio das contas é %.2f", valorMedioDespesas);
	}
}
