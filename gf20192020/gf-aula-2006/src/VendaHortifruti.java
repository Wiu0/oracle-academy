import java.util.Scanner;

public class VendaHortifruti {

	static void venderProduto(Scanner entrada, String nomeProduto, 
			double valorUn) {
		int qtdDispVender = 10;
		System.out.println("Voce deseja quantas " + nomeProduto + "?");
		int quantidadeCompra = entrada.nextInt();
		
		if(quantidadeCompra > qtdDispVender) {
			System.out.println("Sinto muito, mas nós só temos " + qtdDispVender);
		}else {
			qtdDispVender -= quantidadeCompra;
			System.out.println("O valor é " + quantidadeCompra * valorUn);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá!!! Desejamos uma ótima compra na Horti Family");
		venderProduto(sc, "Maca", 0.5);
		venderProduto(sc, "Laranja", 0.8);
		venderProduto(sc, "Uva", 1.5);
		
		
		
		sc.close();
	}
}
