package tabuada;
import java.util.Scanner;

public class TabuadaMediaModeloMetodos2 {
	
	static int numeroDaTabuada;
	
	public static void main(String[] args) {
		mostrarMensagemInicialSistema();
		capturarNumeroDaTabuada();
		mostrarTabuadaAteDez();
	}

	static void mostrarMensagemInicialSistema() {
		System.out.println("Informa o numero da tabuada a ser calculada");		
	}
	
	static void capturarNumeroDaTabuada() {
		Scanner sc = new Scanner(System.in);
		int numeroTabuada = sc.nextInt();
		sc.close();
		numeroDaTabuada = numeroTabuada;
	}
	
	static void mostrarTabuadaAteDez() {
		for(int i = 0; i < 11; i++) {
			System.out.println(i + " * " + numeroDaTabuada + " = " + (i * numeroDaTabuada));
		}
	}
}
