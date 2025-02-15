import java.util.Scanner;

public class EscolhaTarde {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("0: Sair");
			System.out.println("1: Cadastrar");
			System.out.println("2: Visualizar");
			opcao = sc.nextInt();
			if(opcao == 1) {
				System.out.println("Tela de Cadastro");
			} else if(opcao == 2) {
				System.out.println("Tela de Visualizacao");
			} else if(opcao == 0) {
				System.out.println("Saindo");
			} else {
				System.out.println("Invalido");
			}
		} while(opcao != 0);
		sc.close();
	}
}
