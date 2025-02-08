import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double somaNota = 0;
		double somaPeso = 0;
		double media = 0;
		
		System.out.println("Informe qtd notas");
		int qtdNotas = sc.nextInt();
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("Informe a nota " + i);
			double nota = sc.nextDouble();
			System.out.println("Informe o peso " + i);
			double peso = sc.nextDouble();
			double notaTotal = nota * peso;
			
			somaNota = somaNota + notaTotal;
			somaPeso = somaPeso + peso;
		}
		
		media = somaNota/somaPeso;
		System.out.println("Sua média é: " + media);
		sc.close();
	}

}
