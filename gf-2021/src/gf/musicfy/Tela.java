package gf.musicfy;

import java.util.Scanner;

public class Tela {

	static Scanner sc = new Scanner(System.in);
	static Musica music = new Musica();
	
	public static void main(String[] args) {
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
			System.out.println("1 - Incluir música");
			System.out.println("2 - Consultar música");
			System.out.println("3 - Alterar música");
			System.out.println("4 - Deletar música");
			System.out.println("*********************************");

			opcao = sc.nextInt();
			System.out.println("Voce escolheu a opcao: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Encerrando programa");
				break;
			case 1:
				incluirMusica();
				break;
			case 2:
				consultarMusica();
				break;
			case 3:
				alterarMusica();
				break;
			case 4:
				deletarMusica();
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
				break;
			}
		} while (opcao != 0);
		sc.close();
	}

	static void incluirMusica() {

		System.out.println("Cadastrar música. Entre com os dados da musica");
		System.out.println("=================================\n");
		System.out.println("Informe o nome da música");
		sc.nextLine();
		music.nome = sc.nextLine();
		System.out.println("Informe o genero da música");
		music.genero = sc.nextLine();
		System.out.println("Informe a duração da música");
		music.duracao = sc.nextDouble();
		System.out.println("Informe o artista da música");
		sc.nextLine();
		music.artista = sc.nextLine();
		System.out.println("Informe a nota que você dá para a música");
		music.pontuacao = sc.nextByte();

		System.out.println("\nMusica cadastrada com sucesso: ");
		System.out.println("Nome     : " + music.nome);
		System.out.println("Genero   : " + music.genero);
		System.out.println("Duração  : " + music.duracao);
		System.out.println("Artista  : " + music.artista);
		System.out.println("Pontuação: " + music.pontuacao);
	}

	static void consultarMusica() {
		System.out.println("\nMusica   : ");
		System.out.println("Nome     : " + music.nome);
		System.out.println("Genero   : " + music.genero);
		System.out.println("Duração  : " + music.duracao);
		System.out.println("Artista  : " + music.artista);
		System.out.println("Pontuação: " + music.pontuacao);
	}

	static void deletarMusica() {

		music.nome = "";
		music.genero = "";
		music.duracao = 0;
		music.artista = "";
		music.pontuacao = 0;
	}

	static void alterarMusica() {
		System.out.println("Digite o numero para escolher o que deseja alterar musica");
		System.out.println("1. nome, 2. Genero, 3. Duração, 4. Artista, 5. Pontuacao");
		int opcao = sc.nextInt();
		if(opcao == 1) {
			System.out.println("Digite o novo nome");
			sc.nextLine();
			music.nome = sc.nextLine();
		} else if(opcao == 2) {
			System.out.println("Digite o novo genero");
			sc.nextLine();
			music.genero = sc.nextLine();
		} else if(opcao == 3) {
			System.out.println("Digite o novo duração");
			music.duracao = sc.nextDouble();
		}
	}
	
}
