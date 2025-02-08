import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a qtd carros");
		int qtdCarros = sc.nextInt();
		for (int i = 0; i < qtdCarros; i++) {
			System.out.println("Entre com a qtd percusos do carro " + i);
			int qtdPercusos = sc.nextInt();
			Carro carA = new Carro();
			for (int j = 0; j < qtdPercusos; j++) {
				System.out.println("Entre com o combustivel do percusos "+ j + " do carro " + i);
				carA.addCombustivelGasto(sc.nextDouble());
			}
			System.out.println("Entre com o total km do percusos do carro " + i);
			carA.totalKm = sc.nextDouble();
			System.out.println("A média foi");
			carA.calcularMediaLitroKm();
			System.out.println(carA.mediaLitro);
		}
		sc.close();
	}
}
