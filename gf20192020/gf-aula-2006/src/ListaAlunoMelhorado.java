import java.util.Scanner;

public class ListaAlunoMelhorado {

	//Array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos");
		int quantidadeAlunos = Integer.parseInt(sc.nextLine());
		
		Aluno nomeAlunos[] = new Aluno[quantidadeAlunos];
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Informe o nome do aluno");
			Aluno aluno = new Aluno();
			aluno.setNome(sc.nextLine());
			nomeAlunos[i] = aluno;
		}
		
		
		System.out.println("Primeiro nome informado foi: " + nomeAlunos[0]);
		sc.close();
	}
}