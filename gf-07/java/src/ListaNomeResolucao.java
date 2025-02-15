import java.util.Scanner;

public class ListaNomeResolucao {

	public static Scanner sc = new Scanner(System.in);
	public static String endereco = "";
	public static short quantidadePessoaCasa;
	public static boolean temFilhos;
	public static double rendaMensal;
	
	public static void mostrarMenuInicial() {
		System.out.println("===============================================================");
		System.out.println("Sistema de Aluno GF");
		System.out.println("===============================================================");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - Listar aluno");
	}

	public static String responderQuestionario() {
		String name;

		System.out.println("Qual seu nome?");
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Qual seu endereço");
		endereco = sc.nextLine();
		System.out.println("Quantidade de pessoas");
		quantidadePessoaCasa = sc.nextShort();

		System.out.println("Tem filhos. Digite sim ou nao");
		String respostaTemFilho = sc.next();
		if (respostaTemFilho.equals("sim")) {
			temFilhos = true;
		} else {
			temFilhos = false;
		}

		System.out.println("Renda mensal");
		rendaMensal = sc.nextDouble();
		
		System.out.println("Cadastro realizado com sucesso:");
		return name;
	}

	public static void listarDadosPessoa(String nome) {
		
		System.out.print("Nome: ");
		System.out.println(nome);
		System.out.print("Endereco: ");
		System.out.println(endereco);
		System.out.print("Quantidade: ");
		System.out.println(quantidadePessoaCasa);
		System.out.print("Tem filhos: ");
		if(temFilhos) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		System.out.print("Renda: ");
		System.out.println(rendaMensal);
	}

	private static void mostrarOpcaoInvalida() {
		System.out.println("Opcao invalida");
	}

	public static void sair() {
		System.out.println("Saindo");
	}

	public static String apresentarDetalheOpcaoEscolhida(int opcao, String n) {
		switch (opcao) {
		case 0:
			sair();
			break;
		case 1:
			n = responderQuestionario();
			break;
		case 2:
			listarDadosPessoa(n);
			break;
		default:
			mostrarOpcaoInvalida();
		}
		return n; 
	}

	public static void main(String[] args) {
		String nome = "";
		int opcao;
		do {
			mostrarMenuInicial();
			opcao = sc.nextInt();
			nome = apresentarDetalheOpcaoEscolhida(opcao, nome);
		} while (opcao != 0);
		sc.close();
	}
}