import java.util.Scanner;

public class ListaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os nomes");
		String[] nome = new String[3];
		
		for(int i = 0; i < 3; i++) {
			nome[i] = sc.nextLine();
		}
	}
}
