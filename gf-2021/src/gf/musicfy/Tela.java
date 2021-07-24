package gf.musicfy;

import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		String nomeMusica = "";
		String generoMusica = "";
		double duracaoMusica = 0.0;
		String artistaMusica = "";
		byte pontuacaoMusica = 0;

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
			case 1:
				System.out.println("Cadastrar música. Entre com os dados da musica");
				System.out.println("=================================\n");
				System.out.println("Informe o nome da música");
				sc.nextLine();
				nomeMusica = sc.nextLine();
				System.out.println("Informe o genero da música");
				generoMusica = sc.nextLine();
				System.out.println("Informe a duração da música");
				duracaoMusica = sc.nextDouble();
				System.out.println("Informe o artista da música");
				sc.nextLine();
				artistaMusica = sc.nextLine();
				System.out.println("Informe a nota que você dá para a música");
				pontuacaoMusica = sc.nextByte();

				System.out.println("\nMusica cadastrada com sucesso: ");
				System.out.println("Nome     : " + nomeMusica);
				System.out.println("Genero   : " + generoMusica);
				System.out.println("Duração  : " + duracaoMusica);
				System.out.println("Artista  : " + artistaMusica);
				System.out.println("Pontuação: " + pontuacaoMusica);
				break;

			case 2:
				System.out.println("\nMusica : ");
				System.out.println("Nome     : " + nomeMusica);
				System.out.println("Genero   : " + generoMusica);
				System.out.println("Duração  : " + duracaoMusica);
				System.out.println("Artista  : " + artistaMusica);
				System.out.println("Pontuação: " + pontuacaoMusica);
				break;
				
			case 3:
				System.out.println("\nAlterar Musica : ");

				break;
			case 4:
				System.out.println("\nDeletar Musica : ");
				nomeMusica = "";
				generoMusica = "";
				duracaoMusica = 0;
				artistaMusica = "";
				pontuacaoMusica = 0;
				break;
			default:
				System.out.println("Opcao invalida. Opcao digitada foi " + opcao);
				break;
			}
		} while (opcao != 0);

		sc.close();
	}
}
