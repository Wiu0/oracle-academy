import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		double somatoriaNotas = 0;
		int quantidadeNotas = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas");
		quantidadeNotas = sc.nextInt();
		
		for (int i = 0; i < quantidadeNotas; i++) {
			System.out.println("Informe a nota " + i);
			somatoriaNotas = somatoriaNotas + sc.nextDouble();
		}
		sc.close();
		double media = somatoriaNotas/quantidadeNotas;
		
		System.out.println("Sua media é: " + media);

	}
}
