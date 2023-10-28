import java.util.Scanner;

public class ListaChamada {

	//Cadastrar todos os alunos de uma sala
	//Posteriormente mostrar todos os alunos que começam com "a" letra
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeAlunos;
		
		System.out.println("Sala de aula A");
		System.out.println("Informe a quantidade de alunos na sala");
		quantidadeAlunos = sc.nextInt();
		sc.nextLine();
		String[] nomes = new String[quantidadeAlunos];
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Informe o nome do aluno " + i);
			nomes[i] = sc.nextLine();
		}
		
		
		System.out.println("Nomes cadastrados que começam com a Letra \"A\"");
		for(int j = 0; j < nomes.length; j++) {
			if(nomes[j].startsWith("a") || nomes[j].startsWith("A")) {				
				System.out.println(nomes[j]);
			}	
		}
		
		//System.out.println("Nome: " + nome);
		sc.close();
	}
}
