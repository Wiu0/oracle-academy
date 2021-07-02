package desafio.level1;

public class RendaSalarial {
	
	public static void main(String[] args) {
		calcularTotalDaRendaSalarial(25, 2000);
	}
	
	static void calcularTotalDaRendaSalarial(double salarioPessoa1, double salarioPessoa2) {
		double valorTotal = salarioPessoa1 + salarioPessoa2;
		System.out.println(valorTotal);
	}
}
