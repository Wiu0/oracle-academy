import java.util.Random;
import java.util.Scanner;

public class EnergiaResposta {
 	
	public static double calcularGastoWatts(int quantidadeWattsGasto, double valorPorWatts) {
		System.out.println("Bandeira valor: " + valorPorWatts);
		double valorPagar = quantidadeWattsGasto/100. * valorPorWatts;
		return valorPagar;
	}
	
	public static void apresentarTextoInicial() {
		System.out.println("Ola coloque a quantidade watts gastas");
	}

	public static void apresentarValorFinalAPagar(double valor) {
		System.out.println("O Valor q vc vai pagar é: " + valor);
	}
	
	public static double pegarValorAleatorioBandeira() {
		double valorBandeira;
		Random rd = new Random();
		int valorAleatorio = rd.nextInt(3);
		if(valorAleatorio == 0) {
			valorBandeira = 3;
		} else if( valorAleatorio == 1) {
			valorBandeira = 8;
		} else {
			valorBandeira = 10;
		}
		return valorBandeira;
	}
	
	public static void main(String[] args) {
		int quantidadeWattsGasto;
		Scanner sc = new Scanner(System.in);
		
		apresentarTextoInicial();
		quantidadeWattsGasto = sc.nextInt();
		double bandeira = pegarValorAleatorioBandeira();
	
		double valorAPagar = calcularGastoWatts(quantidadeWattsGasto, bandeira);
		apresentarValorFinalAPagar(valorAPagar);
		sc.close();
	}
}
