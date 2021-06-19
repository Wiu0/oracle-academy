package br.com.oraclegf.learning.general;
import java.util.Scanner;

public class MultiGame {

	public static void main(String[] args) {
		// Jogo da velha, Forca, Damas
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um dos jogos: 1-Jogo da velha, 2-Forca e 3-Damas");

		int opcaoSelecionada = sc.nextInt();

		switch (opcaoSelecionada) {
		
		case 1:
			System.out.println("Iniciar joga da velha");
			break;
		case 2:
			System.out.println("Jogo da forca");
			break;
		case 3:
			System.out.println("Iniciar damas");
			break;
		default:
			System.out.println("Opcao selecionada nao existe " + opcaoSelecionada);
			break;
		}
		

//		if (opcaoSelecionada == 1) {
//			System.out.println("Iniciar joga da velha");
//		} else if (opcaoSelecionada == 2) {
//			System.out.println("Iniciar joga da forca");
//		} else if (opcaoSelecionada == 3) {
//			System.out.println("Iniciar damas");
//		} else {
//			System.out.println("Opcao selecionada nao existe " + opcaoSelecionada);
//		}

		sc.close();
	}
}
//if(opcaoSelecionada.equals("velha")) {
//	System.out.println("Iniciar joga da velha");
//} else {
//	if(opcaoSelecionada.equals("Forca")) {
//		System.out.println("Iniciar joga da forca");	
//	} else {
//		if(opcaoSelecionada.equals("Damas")) {
//			System.out.println("Iniciar damas");
//		} else {
//			System.out.println("Opcao selecionada nao existe " + opcaoSelecionada);
//		}
//	}
//}

//Jogo da velha, Forca, Damas
//Scanner sc = new Scanner(System.in);
//
//System.out.println("Escolha um dos jogos: Jogo da velha, Forca e Damas");
//
//String opcaoSelecionada = sc.next(); 
//
//if (opcaoSelecionada.equalsIgnoreCase("velha")) {
//	System.out.println("Iniciar joga da velha");
//} else if (opcaoSelecionada.equalsIgnoreCase("Forca")) {
//	System.out.println("Iniciar joga da forca");
//} else if (opcaoSelecionada.equalsIgnoreCase("Damas")) {
//	System.out.println("Iniciar damas");
//} else {
//	System.out.println("Opcao selecionada nao existe " + opcaoSelecionada);
//}
//
//
//sc.close();