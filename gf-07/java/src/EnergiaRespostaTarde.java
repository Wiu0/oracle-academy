import java.util.Scanner;

public class EnergiaRespostaTarde {
	
	static Scanner sc = new Scanner(System.in);

	public static void apresentarMenu() {
		System.out.println("Seja bem vindo ao sistema de Energia");
		System.out.println("100 watts 3,00 reais na bandeira 1");
		System.out.println("100 watts 8,00 reais na bandeira 2");
		System.out.println("100 watts 10,00 reais na bandeira 3");
	}
	
	public static int pegarWatts() {
		System.out.println("Informe a qtd watts: "); 
		return sc.nextInt();
	}
	
	public static int pegarBandeira() {
		System.out.println("Qual a Ban");
		return sc.nextInt();
	}
	
	public static double calcularValorFinal(int watts, int bandeira) {
		double valorFinal = 0;
		switch(bandeira) {
		case 1:
			valorFinal = calcularValorBandeira1(watts);
			break;
		case 2:
			valorFinal = watts/100. * 8.00;
			break;
		case 3:
			valorFinal = watts * 0.1;
			break;
		default:
			System.out.println("Bandeira invalida");	
		}
		return valorFinal;
	}

	private static double calcularValorBandeira1(int watts) {
		double valorFinal;
		valorFinal = watts * 0.03;
		return valorFinal;
	}
	
	public static void main(String[] args) {
		apresentarMenu();
		int watts = pegarWatts();
		int ban = pegarBandeira();
		double t = calcularValorFinal(watts, ban);
		System.out.println("Valor: " + t);
	}
}
