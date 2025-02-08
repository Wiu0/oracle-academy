import java.util.Scanner;

public class ListaNomeResposta {

	static Scanner sc = new Scanner(System.in);
	static Person pessoa = new Person();

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
			// Endereco, quantidade em casa, tem filhos e renda mensal
			System.out.println("Qual seu nome?");
			sc.nextLine();
			pessoa.nome = sc.nextLine();
			System.out.println("Qual seu endereco");
			pessoa.endereco = sc.nextLine();

			System.out.println("people em casa");
			pessoa.qtdPessoasCasa = sc.nextByte();

			sc.nextLine();
			System.out.println("Tem fiote?(sim ou nao)");
			String valorDigitado = sc.nextLine();
			pessoa.temFilhos = false;

			if (valorDigitado.equalsIgnoreCase("sim")) {
				pessoa.temFilhos = true;
			} else if (valorDigitado.equals("nao")) {
				pessoa.temFilhos = false;
			} else {
				System.out.println("Valor invalido " + valorDigitado + ". DIGITE APENAS SIM E NAO CARAIO");
			}

			System.out.println("Renda mensal");
			pessoa.renda = sc.nextDouble();

			System.out.println("Idade");
			pessoa.idade = sc.nextInt();
			break;
		case 2:
			System.out.println("Pessoa:");
			System.out.println(pessoa.getDetail());
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