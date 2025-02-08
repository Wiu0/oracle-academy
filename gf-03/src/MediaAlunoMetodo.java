import java.util.Scanner;

public class MediaAlunoMetodo {
	
	public static void verificarSeNotaEhValidaOuInvalida(double nota) {
		if(nota >= 0 && nota <=10) {
			System.out.println("Nota valida");
		}else {
			System.out.println("Nota invalida");
		}
	}
	static void calcularMedia(double arroz, double feijao, double a, double nota4) {
		double media = (arroz + feijao + a + nota4)/4;
		System.out.println("média de " + media);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble(), nota2 = sc.nextDouble(), 
			   nota3 = sc.nextDouble(), nota4 = sc.nextDouble();
		
		verificarSeNotaEhValidaOuInvalida(nota1);
		verificarSeNotaEhValidaOuInvalida(nota2);
		verificarSeNotaEhValidaOuInvalida(nota3);
		verificarSeNotaEhValidaOuInvalida(nota4);	
		calcularMedia(nota1, nota2, nota3, nota4);
		sc.close();
	}
}