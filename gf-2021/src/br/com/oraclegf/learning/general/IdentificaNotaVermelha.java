package br.com.oraclegf.learning.general;

public class IdentificaNotaVermelha {

	
	public static void main(String[] args) {
		double notas[] = new double[4];
		
		notas[0] = 10;
		notas[1] = 4;
		notas[2] = 9;
		notas[3] = 6;
							
		int k = 0;
		
		while(k < notas.length) { 	
			if(notas[k] >= 8) {
				System.out.println("Cola no pai, nota " + (k + 1) + " foi : " + notas[k]);
			} else if(notas[k] < 5) {
				System.out.println("Deu ruim, nota " + (k + 1) + " foi: " +  notas[k]);
				break;
			}
			k++;
		}
		
//		for (int i = 0; i < notas.length; i++) {
//			
//			if(notas[i] >= 8) {
//				System.out.println("Cola no pai, nota " + (i + 1) + " foi : " + notas[i]);
//			} else if(notas[i] < 5) {
//				System.out.println("Deu ruim, nota " + (i + 1) + " foi: " +  notas[i]);
//				break;
//			}
//		}
		System.out.println("Fazer algo");
		System.out.println("Fazer outra coisa");
		
		
		
	}
}
