package gf.musicfy.tela;

import java.util.Scanner;

//Usuario
//Playlist
//Album
//Artista
//Plano
//Menu???
//Configuracoes
//Funcionario
//Favoritos?

public class TelaInicial {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		selecionarOpcao();
		
	}

	static void selecionarOpcao() {

		int opcao;

		System.out.println("Olá! Bem vindo ao sistema musicfy\n");

		do {
			System.out.println("=================================");
			System.out.println("Escolha uma opção abaixo:");
			System.out.println("*********************************");
			System.out.println("0 - Sair");
			System.out.println("1 - Música");
			System.out.println("2 - Artista");
			System.out.println("*********************************");

			opcao = Integer.parseInt(sc.nextLine());
			System.out.println("Voce escolheu a opcao: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Encerrando programa");
				break;
			case 1:
				TelaMusica.opcoes();
				break;
			case 2:
				TelaArtista.opcoes();
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
				break;
			}
		} while (opcao != 0);
		sc.close();
	}	
}
