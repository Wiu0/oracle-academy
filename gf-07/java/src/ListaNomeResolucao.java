import java.util.Scanner;

public class ListaNomeResolucao {

	public static Scanner sc = new Scanner(System.in);
	public static Aluno estudante = new Aluno();
	
	public static void mostrarMenuInicial() {
		System.out.println("===============================================================");
		System.out.println("Sistema de Aluno GF");
		System.out.println("===============================================================");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - Listar aluno");
	}

	public static void responderQuestionario() {
	
		System.out.println("Qual seu nome?");
		sc.nextLine();
		estudante.nome = sc.nextLine();

		System.out.println("Qual seu endereço");
		estudante.endereco = sc.nextLine();
		System.out.println("Quantidade de pessoas");
		estudante.quantidadePessoaNaCasa = sc.nextShort();
		System.out.println("Tem filhos. Digite sim ou nao");
		String respostaTemFilho = sc.next();
		System.out.println();
		if (respostaTemFilho.equalsIgnoreCase("sim")) {
			estudante.temFilhos = true;
		} else {
			estudante.temFilhos = false;
		}

		System.out.println("Renda mensal");
		estudante.rendaMensal = sc.nextDouble();
		
		System.out.println("Cadastro realizado com sucesso:");
	
	}

	public static void listarDadosPessoa() {
		
		System.out.print("Nome: ");
		System.out.println(estudante.nome);
		System.out.print("Endereco: ");
		System.out.println(estudante.endereco);
		System.out.print("Quantidade: ");
		System.out.println(estudante.quantidadePessoaNaCasa);
		System.out.print("Tem filhos: ");
		if(estudante.temFilhos) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		System.out.print("Renda: ");
		System.out.println(estudante.rendaMensal);
	}

	private static void mostrarOpcaoInvalida() {
		System.out.println("Opcao invalida");
	}

	public static void sair() {
		System.out.println("Saindo");
	}

	public static void apresentarDetalheOpcaoEscolhida(int opcao) {
		switch (opcao) {
		case 0:
			sair();
			break;
		case 1:
			responderQuestionario();
			break;
		case 2:
			listarDadosPessoa();
			break;
		default:
			mostrarOpcaoInvalida();
		}
	}

	public static void main(String[] args) {
		int opcao;
		do {
			mostrarMenuInicial();
			opcao = sc.nextInt();
			apresentarDetalheOpcaoEscolhida(opcao);
		} while (opcao != 0);
		sc.close();
	}
}