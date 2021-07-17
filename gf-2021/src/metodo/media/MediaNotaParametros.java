package metodo.media;

import java.util.Scanner;

public class MediaNotaParametros {
	
	
	public static void main(String[] args) {
		double nota1, nota2, nota3;
		Scanner sc = new Scanner(System.in);		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		sc.close();
		
		double mediaCalculada = calcularMediaNotas(nota1, nota2, nota3);
		boolean aprovado = alunoEstaReprovado(mediaCalculada);
		System.out.println(aprovado);
		
	}
	
	
	static boolean alunoEstaReprovado(double media) {
		if(media < 7) {
			return true;
		}else {
			return false;
		}
		
//		return media < 7;
	}
		
	static double calcularMediaNotas(double nota1Aluno, double nota2Aluno, double nota3Aluno) {
		double media;
		media = (nota1Aluno + nota2Aluno + nota3Aluno)/3;
		return media;
	}
}
