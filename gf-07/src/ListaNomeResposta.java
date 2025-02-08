import java.util.Scanner;

public class ListaNomeResposta {
	static Scanner sc = new Scanner(System.in);
	static String nome = "";

	public static void apresentarMenuInicial() {
		System.out.println("===============================================================");
		System.out.println("Sistema de Pessoa GF");
		System.out.println("===============================================================");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar pessoa");
		System.out.println("2 - Listar pessoa");
	}

	public static int pegarOpcaoDigitadaUsuario() {
		int opcao = sc.nextInt();
		return opcao;
	}

	public static void executarOpcao(int o) {
		switch (o) {
		case 0:
			System.out.println("Saindo");
			break;
		case 1:
			System.out.println("Qual seu nome?");
			sc.nextLine();
			nome = sc.nextLine();
			break;
		case 2:
			System.out.println("Pessoa:");
			System.out.println(nome);
			break;
		default:
			System.out.println("Opcao invalida");
		}
	}
	
	public static void main(String[] args) {
		int opcao;
		do {
			apresentarMenuInicial();
			opcao = pegarOpcaoDigitadaUsuario();
			executarOpcao(opcao);
		} while (opcao != 0);
		sc.close();
	}
}