package tabuada;
import java.util.Scanner;

public class TabuadaMediaModeloMetodos {
	
	public static void main(String[] args) {
		mostrarMensagemInicialSistema();
		int numeroDaTabuada = capturarNumeroDaTabuada();
		mostrarTabuadaAteDez(numeroDaTabuada);
	}

	static void mostrarMensagemInicialSistema() {
		System.out.println("Informa o numero da tabuada a ser calculada");		
	}
	
	static int capturarNumeroDaTabuada() {
		Scanner sc = new Scanner(System.in);
		int numeroTabuada = sc.nextInt();
		sc.close();
		return numeroTabuada;
	}
	
	static void mostrarTabuadaAteDez(int numeroDaTabuada) {
		for(int i = 0; i < 11; i++) {
			System.out.println(i + " * " + numeroDaTabuada + " = " + (i * numeroDaTabuada));
		}
	}
}
