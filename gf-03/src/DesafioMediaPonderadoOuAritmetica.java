import java.util.Scanner;

public class DesafioMediaPonderadoOuAritmetica {

	
	static double calcularMediaAritmetica(Scanner scanner) {
		System.out.println("Calculo aritmetico");
		System.out.println("Informe quantas notas voce irá avaliar:");
		int qtdNotas = scanner.nextInt();
		double somatoriaNota = 0;
		
		for(int i = 1; i <= qtdNotas; i++) {
			System.out.println("Informe nota " + i);
			somatoriaNota = somatoriaNota + scanner.nextDouble();
		}
		double media = somatoriaNota/qtdNotas;
		return media;	
	}
	
	static double calcularMediaPonderada(Scanner entrada) {
		System.out.println("calculo ponderado");
		System.out.println("Informe quantas notas voce irá avaliar:");
		int qtdNotas = entrada.nextInt();
		double somatoriaNota = 0;
		double somatoriaPeso = 0;
		double nota;
		int peso;
		
		for(int i = 1; i <= qtdNotas; i++) {
			System.out.println("Informe nota " + i);
			nota = entrada.nextDouble();
			System.out.println("Informe peso " + i);
			peso = entrada.nextInt();
			somatoriaNota = somatoriaNota + nota * peso;
			somatoriaPeso = somatoriaPeso + peso;
		}
		double media = somatoriaNota/somatoriaPeso;
		return media;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\\Digite: \n\"1\" - Média aritmética \n\"2\" - Média ponderada");
		byte opcao = sc.nextByte();
		double media = 0;
		
		if (opcao == 1) {
			media = calcularMediaAritmetica(sc);
		} else if (opcao == 2) {
			media = calcularMediaPonderada(sc);
		} else {
			System.out.println("Opcao invalida");
		}
		
		System.out.println("A média do aluno foi: " + media);
		sc.close();
	}
}
