import java.util.Scanner;

public class Escolha {
		
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("======================================");
			System.out.println("Menu de Opções (Digite um dos números):");
			System.out.println("0: para encerrar o programa");
			System.out.println("1: Tela de Cadastro");
			System.out.println("2: Tela de Visualização");
			System.out.println("======================================");
			opcao = sc.nextInt();
			if(opcao == 1) {
				System.out.println("TELA PARA CADASTRO");
			} else if(opcao == 2) {
				System.out.println("TELA PARA VISUALIZACAO");
			}else if(opcao == 0) {
				System.out.println("SAINDO");
			} else {
				System.out.println("OPCAO INVALIDO");
			}
			
		} while(opcao != 0);
		sc.close();
	}
}
