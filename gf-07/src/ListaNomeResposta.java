import java.util.Scanner;

public class ListaNomeResposta {
	
	static Scanner sc = new Scanner(System.in);
	static String nome = "";
	static String endereco;
	static byte qtdPessoasCasa;
	static boolean temFilhos; 
	static double renda;
	
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
			//Endereco, quantidade em casa, tem filhos e renda mensal
			System.out.println("Qual seu nome?");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Qual seu endereco");
			endereco = sc.nextLine();
			
			System.out.println("people em casa");
			qtdPessoasCasa = sc.nextByte();
			
			sc.nextLine();
			System.out.println("Tem fiote?(sim ou nao)");
			String valorDigitado = sc.nextLine();		
			temFilhos = false;
			
			if(valorDigitado.equalsIgnoreCase("sim")) {
				temFilhos = true;				
			} else if(valorDigitado.equals("nao")){
				temFilhos = false;
			} else {
				System.out.println("Valor invalido " + valorDigitado + ". DIGITE APENAS SIM E NAO CARAIO");
			}
						
			System.out.println("Renda mensal");
			renda = sc.nextDouble();
			break;
		case 2:
			System.out.println("Pessoa:");
			System.out.println("Nome: " + nome);
			System.out.println("Endereco:" + endereco);
			System.out.println("Qtd Pessoas:" + qtdPessoasCasa);
			System.out.println("Tem filho:" + temFilhos);
			System.out.println("Renda:" + renda);
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