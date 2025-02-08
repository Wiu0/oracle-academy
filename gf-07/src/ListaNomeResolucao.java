import java.util.Scanner;

public class ListaNomeResolucao {

	public static void mostrarMenuInicial() {
		System.out.println("===============================================================");
		System.out.println("Sistema de Aluno GF");
		System.out.println("===============================================================");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - Listar aluno");
	}

	public static String perguntarNome(Scanner sc) {
		String name;
		System.out.println("Qual seu nome?");
		sc.nextLine();
		name = sc.nextLine();
		return name;
	}

	public static void listarNomes(String nome) {
		System.out.println("Alunos:");
		System.out.println(nome);
	}

	private static void mostrarOpcaoInvalida() {
		System.out.println("Opcao invalida");
	}

	public static void sair() {
		System.out.println("Saindo");
	}

	public static String apresentarDetalheOpcaoEscolhida(int opcao, Scanner scanner, String n) {
		switch (opcao) {
		case 0:
			sair();
			break;
		case 1:
			n = perguntarNome(scanner);
			break;
		case 2:
			listarNomes(n);
			break;
		default:
			mostrarOpcaoInvalida();
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		int opcao;
		do {
			mostrarMenuInicial();
			opcao = sc.nextInt();
			nome = apresentarDetalheOpcaoEscolhida(opcao, sc, nome);
		} while (opcao != 0);
		sc.close();
	}
}