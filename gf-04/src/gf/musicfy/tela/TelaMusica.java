package gf.musicfy.tela;

import java.util.Scanner;

import gf.musicfy.Musica;

public class TelaMusica {

	private static Scanner sc = new Scanner(System.in);
	private static Musica music = new Musica();
	private static Musica musics[] = new Musica[100];
	
	static void opcoes() {
		int opcao;
		do {
			System.out.println("Opções para música. Entre com a opcao desejada");
			System.out.println("=================================\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - Incluir Musica");
			System.out.println("2 - Alterar Musica");
			System.out.println("3 - Consultar Musica");
			System.out.println("4 - Deletar Musica");

			opcao = Integer.parseInt(sc.nextLine());
			System.out.println("Voce escolheu a opcao: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Voltar para menu anterior");
				break;
			case 1:
				// O que tem q acontecer aqui. Incluir musica, Alterar Musica, Consultar,
				// deletar
				TelaMusica.incluirMusica();
				break;
			case 2:
				TelaMusica.alterarMusica();
				break;
			case 3:
				TelaMusica.consultarMusica();
				break;
			case 4:
				// Incluir o Artista
				TelaMusica.deletarMusica();
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
				break;
			}
		} while (opcao != 0);
	}

	private static void incluirMusica() {

		System.out.println("Cadastrar música. Entre com os dados da musica");
		System.out.println("=================================\n");
		System.out.println("Informe o nome da música");
		music.nome = sc.nextLine();
		System.out.println("Informe o genero da música");
		music.genero = sc.nextLine();
		System.out.println("Informe a duração da música");
		music.duracao = Double.parseDouble(sc.nextLine());
		System.out.println("Informe o artista da música");
		music.artista = sc.nextLine();
		System.out.println("Informe a nota que você dá para a música");
		music.pontuacao = Byte.parseByte(sc.nextLine());

		System.out.println("\nMusica cadastrada com sucesso: ");
		System.out.println("Nome     : " + music.nome);
		System.out.println("Genero   : " + music.genero);
		System.out.println("Duração  : " + music.duracao);
		System.out.println("Artista  : " + music.artista);
		System.out.println("Pontuação: " + music.pontuacao);
		
		
	}

	private static void consultarMusica() {
		System.out.println("\nMusica   : ");
		System.out.println("Nome     : " + music.nome);
		System.out.println("Genero   : " + music.genero);
		System.out.println("Duração  : " + music.duracao);
		System.out.println("Artista  : " + music.artista);
		System.out.println("Pontuação: " + music.pontuacao);
	}

	private static void deletarMusica() {

		music.nome = "";
		music.genero = "";
		music.duracao = 0;
		music.artista = "";
		music.pontuacao = 0;
	}

	private static void alterarMusica() {
		System.out.println("Digite o numero para escolher o que deseja alterar musica");
		System.out.println("1. nome, 2. Genero, 3. Duração, 4. Artista, 5. Pontuacao");
		int opcao = Integer.parseInt(sc.nextLine());
		if (opcao == 1) {
			System.out.println("Digite o novo nome");
			music.nome = sc.nextLine();
		} else if (opcao == 2) {
			System.out.println("Digite o novo genero");
			music.genero = sc.nextLine();
		} else if (opcao == 3) {
			System.out.println("Digite o novo duração");
			music.duracao = Double.parseDouble(sc.nextLine());
		}
	}
}
