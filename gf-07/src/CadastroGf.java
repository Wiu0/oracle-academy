import java.util.Scanner;

public class CadastroGf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		String nomeAluno[] = new String[3];
		int posicaoAtualLista = 0;
		
		do {
			System.out.println("**************************");
			System.out.println("Sistema Alunos GF");
			System.out.println("**************************");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar(" + posicaoAtualLista +"/" + nomeAluno.length + ")");
			System.out.println("2 - Listar");

			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				sc.nextLine();
				nomeAluno[posicaoAtualLista++] = sc.nextLine();
				break;
			case 2:
				System.out.println("Alunos:");
				for(int i = 0; i < posicaoAtualLista; i++) {
					System.out.println(nomeAluno[i]);					
				}
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
			}
		} while (opcao != 0);
		sc.close();
	}
}
