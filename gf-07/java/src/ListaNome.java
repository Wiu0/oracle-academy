import java.util.Scanner;

public class ListaNome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		int opcao;
		do {
			System.out.println("===============================================================");
			System.out.println("Sistema de Pessoa GF");
			System.out.println("===============================================================");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar pessoa");
			System.out.println("2 - Listar pessoa");
			opcao = sc.nextInt();
			switch(opcao){
			case 0: 
				System.out.println("Saindo");
				break;
			case 1: 
				System.out.println("Qual seu nome?");
				sc.nextLine();
				nome = sc.nextLine();
				break;
			case 2: 
				System.out.println("Pessoa:");
				System.out.println(nome);
				break;
			default: 
				System.out.println("Opcao invalida");
			}	
		} while(opcao != 0);
		sc.close();
	}	
}