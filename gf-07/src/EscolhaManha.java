import java.util.Scanner;
public class EscolhaManha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("======================================");
			System.out.println("Menu de Opções (Digite um dos números):");
			System.out.println("0: para encerrar o programa");
			System.out.println("1: Tela de Cadastro");
			System.out.println("2: Tela de Visualização");
			System.out.println("======================================");
			opcao = sc.nextInt();
			if (opcao == 0) {
				System.out.println("Saindo");
			} else if (opcao == 1) {
				System.out.println("Cadastro");
			} else if (opcao == 2) {
				System.out.println("Visualizacao");
			} else {
				System.out.println("Valor invalido");
			}
		} while(opcao != 0);
		sc.close();
	}
}
