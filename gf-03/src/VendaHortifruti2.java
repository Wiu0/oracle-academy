import java.util.Scanner;

public class VendaHortifruti2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bom dia, bem vindx a venda Horti Family");
		double totalCompra = 0;
		double totalMaca = venderMaca(sc);
		double totalLaranja = venderLaranja(sc);
		totalCompra =  totalMaca + totalLaranja;
		System.out.println("Total da compra é: " + totalCompra);
		System.out.println("Obrigado pela compra!");
		sc.close();
	}

	private static double venderMaca(Scanner sc) {
		int qtdMacaDispVender = 10;
		double total = 0;
		System.out.println("Voce deseja quantas maçãs?");
		int quantidadeMacasCompra = sc.nextInt();
		
		if(quantidadeMacasCompra > qtdMacaDispVender) {
			System.out.println("Sinto muito, mas nós só temos " + qtdMacaDispVender);
		}else {
			qtdMacaDispVender -= quantidadeMacasCompra;
			total = quantidadeMacasCompra * 0.5;
		}		
		return total;
	}

	private static double venderLaranja(Scanner sc) {
		int qtdLaranjaDispVender = 20;
		double total = 0;
		System.out.println("Voce deseja quantas Laranja?");
		int quantidadeMacasCompra = sc.nextInt();
		
		if(quantidadeMacasCompra > qtdLaranjaDispVender) {
			System.out.println("Sinto muito, mas nós só temos " + qtdLaranjaDispVender);
		}else {
			qtdLaranjaDispVender -= quantidadeMacasCompra;
			total = quantidadeMacasCompra * 0.8;
		}	
		return total;
	}

}

