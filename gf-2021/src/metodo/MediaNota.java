package metodo;

import java.util.Scanner;

public class MediaNota {
	
	
	public static void main(String[] args) {
		perguntarNotasECalcularMediaNotas();
	}

	
	static void perguntarNotasECalcularMediaNotas() {
		double nota1, nota2, nota3;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		sc.close();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println(media);
	}
	
}
