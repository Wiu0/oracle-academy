package br.com.oraclegf.learning.general;

public class EscondeNotaVermelha {

	public static void main(String[] args) {
		double notas[] = new double[4];
		notas[0] = 10;
		notas[1] = 6;
		notas[2] = 8;
		notas[3] = 4;

		
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < 5) {
				System.out.println("Ops, essa nota ai ta errada");
				continue;
			}
			
			System.out.println("Cola no pai, nota " + (i + 1) + " foi : " + notas[i]);
		}
		
//		for (int i = 0; i < notas.length; i++) {
//
//			if (notas[i] < 5) {
//				System.out.println("Ops, essa nota ai ta errada");
//			} else {
//				System.out.println("Cola no pai, nota " + (i + 1) + " foi : " + notas[i]);
//			}
//		}
		
		System.out.println("Fazer algo");
		System.out.println("Fazer outra coisa");
	}
}
