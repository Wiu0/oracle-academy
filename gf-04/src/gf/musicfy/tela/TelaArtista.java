package gf.musicfy.tela;

import java.util.Scanner;

import gf.musicfy.Artista;

public class TelaArtista {

	static Artista artist = new Artista(); 
	static Scanner sc = new Scanner(System.in);
	
	static void opcoes() {
		
		int opcao;
		do {
			System.out.println("Opções para Artista. Entre com a opcao desejada");
			System.out.println("=================================\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - Incluir Artista");

			opcao = Integer.parseInt(sc.nextLine());
			System.out.println("Voce escolheu a opcao: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Voltar para menu anterior");
				break;
			case 1:
				// O que tem q acontecer aqui. Incluir musica, Alterar Musica, Consultar,
				// deletar
				TelaArtista.incluirArtista();
				break;
		
			default:
				System.out.println("Opcao invalida " + opcao);
				break;
			}
		} while (opcao != 0);
	}
	
	protected static void incluirArtista() {

		System.out.println("Cadastrar Artista. Entre com os dados do artista");
		System.out.println("=================================\n");
		System.out.println("Informe o nome do artista");
		artist.nome = sc.nextLine();
		System.out.println("Informe a idade do artista");
		artist.idade = Short.parseShort(sc.nextLine());
		System.out.println("Informe o genero musical do artista");
		artist.generoMusical = sc.nextLine();
	

		System.out.println("\nArtista cadastrado com sucesso: ");
		System.out.println("Nome    : " + artist.nome);
		System.out.println("Idade   : " + artist.idade);
		System.out.println("Genero  : " + artist.generoMusical);
	}
}
