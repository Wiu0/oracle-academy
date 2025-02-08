import java.util.Scanner;

public class MetodoAula {

	public static void apresentarMenuInicial() {
		System.out.println("PROGRAMA SOMAR");
		System.out.println("==============================");
		System.out.println("Esse programa soma dois numeros");
	}

	public static void verificarNumeroNegativo(double valor) {
		if (valor < 0) {
			System.out.println("Vc digitou um numero negativo. " + valor);
		}
	}

	public static double somarDoisNumeros(double valor1, double valor2) {
		double resultado = valor1 + valor2;
		return resultado;
	}

	public static void apresentarValorTotal(double valorTotal) {
		System.out.println("Total da soma é: " + valorTotal);
		System.out.println("Obrigado por utilizar");
	}

	public static double pegarNumeroUsuario(Scanner scanner) {
		System.out.println("Informe o numero");
		double numero = scanner.nextDouble();
		return numero;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		apresentarMenuInicial();
		double numero1 = pegarNumeroUsuario(sc);
		verificarNumeroNegativo(numero1);
		double numero2 = pegarNumeroUsuario(sc);
		verificarNumeroNegativo(numero2);
		double total = somarDoisNumeros(numero1, numero2);
		apresentarValorTotal(total);
		sc.close();
	}
}
