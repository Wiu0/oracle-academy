import java.util.Scanner;

public class Challange2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tMaps GF");
		System.out.println("Informe a quantidade de ruas até o endereço de destino");
		int qtd = sc.nextInt();
		double km = 0;

		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe a distancia em km do rua " + (i+1));
			km += sc.nextDouble();
		}
		System.out.println("Vc vai se deslocar por " + km);
		sc.close();
	}
	
}
