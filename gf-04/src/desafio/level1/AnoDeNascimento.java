package desafio.level1;

public class AnoDeNascimento {
	
	public static void main(String[] args) {
		calcularAnoDeNascimento(25);
		calcularAnoDeNascimento(25, 2000);
	}
	
	
	static void calcularAnoDeNascimento(int idadeAtual) {
		int anoNascimento = 2021 - idadeAtual;
		System.out.println(anoNascimento);
	}
	
	static void calcularAnoDeNascimento(int idadeAtual, int anoAtual) {
		int anoNascimento = anoAtual - idadeAtual;
		System.out.println(anoNascimento);
	}
}
