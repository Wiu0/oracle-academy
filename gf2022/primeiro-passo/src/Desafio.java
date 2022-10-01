import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			String quebraLinha = "******************************";
			System.out.println(quebraLinha);
			System.out.println("Bem vindo");
			System.out.println(quebraLinha);
			System.out.println("");
			System.out.println("1 - Chamada");
			System.out.println("2 - Cadastro");
			System.out.println("3 - Relatorio");
			System.out.println("0 - Sair");
			System.out.println(quebraLinha);
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				break;
			case 2:
				System.out.println("Entre com o nome:");
				System.out.println("Entre com o data Nascimento:");
				System.out.println("Cadastro do NOME, DATA_NASCIMENTO FEITO COM SUCESSO");
				break;
			case 3:
				break;
			case 0:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + sc);
			}
		} while (opcao != 0);
		sc.close();
	}

}
