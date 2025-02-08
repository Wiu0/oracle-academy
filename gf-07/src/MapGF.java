import java.util.Scanner;

public class MapGF {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ruas?");
		int quantidadeRuas = sc.nextInt();
		double totalKM = 0;
		
		for(int i = 1; i <= quantidadeRuas; i++) {
			System.out.println("Qual o KM da rua " + i);	
			double kmRua = sc.nextDouble();
			totalKM += kmRua;
		}
		System.out.println("Total deslocamento " + totalKM);
		sc.close();
	}
}
