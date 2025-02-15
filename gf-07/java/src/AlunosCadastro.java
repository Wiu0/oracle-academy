import java.util.Scanner;

public class AlunosCadastro {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		int quantidadePessoas = 0;
		String[] nomeAluno = new String[3]; 
		do {
			System.out.println("--------------------------");
			System.out.println("Sistema Cadastro GF");
			System.out.println("--------------------------");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar aluno(" + quantidadePessoas + "/" + nomeAluno.length + ")");
			System.out.println("2 - Listar aluno");
			opcao = sc.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				sc.nextLine();
				nomeAluno[quantidadePessoas++] = sc.nextLine();
				break;
			case 2: 
				System.out.println("Alunos:");
				for(int i = 0; i < quantidadePessoas; i++) {
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











































 















