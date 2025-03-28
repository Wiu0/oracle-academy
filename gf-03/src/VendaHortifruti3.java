import java.util.Scanner;

public class VendaHortifruti3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bom dia, bem vindx a venda Horti Family");
		
		double totalCompra = 0;
		double totalMaca = vender(sc, "Maca", 10, 0.5);
		double totalLaranja = vender(sc, "Laranja", 55, 1.20);
		double totalUva = vender(sc, "Uva", 32, 1);
		double totalPera = vender(sc, "Pera", 100, 5);
		
		totalCompra =  totalMaca + totalLaranja + totalUva + totalPera;
		System.out.println("Total da compra é: " + totalCompra);
		System.out.println("Obrigado pela compra!");
		sc.close();
	}

	private static double vender(Scanner sc, String item,
			int qtdDispVender, double valorAVender) {
		 
		double total = 0;
		System.out.println("Voce deseja quantas " + item + "?");
		int quantidadeCompra = sc.nextInt();
		
		if(quantidadeCompra > qtdDispVender) {
			System.out.println("Sinto muito, mas nós só temos " + qtdDispVender);
		}else {
			qtdDispVender -= quantidadeCompra;
			total = quantidadeCompra * valorAVender;
		}		
		return total;
	}

}

