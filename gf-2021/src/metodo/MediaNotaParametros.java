package metodo;

import java.util.Scanner;

public class MediaNotaParametros {
	
	
	public static void main(String[] args) {
		double nota1, nota2, nota3;
		Scanner sc = new Scanner(System.in);		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		sc.close();
		
		calcularMediaNotas(nota1, nota2, nota3);
	}

	
	static void calcularMediaNotas(double nota1Aluno, double nota2Aluno, double nota3Aluno) {
		double media;
		media = (nota1Aluno + nota2Aluno + nota3Aluno)/3;
		System.out.println(media);
	}

	
}
