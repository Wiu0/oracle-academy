import java.util.Scanner;

public class ListaAluno {

	//Array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos");
		int quantidadeAlunos = Integer.parseInt(sc.nextLine());
		
		String nomeAlunos[] = new String[quantidadeAlunos];
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Informe o nome do aluno");
			nomeAlunos[i] = sc.nextLine();
		}
		
		
		System.out.println("Primeiro nome informado foi: " + nomeAlunos[0]);
		sc.close();
	}
}
