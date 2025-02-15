import java.util.Scanner;

public class AlunosTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu nome");
		/*
		 * String nome = sc.next(); sc.close();
		 */
		
		String nome = sc.nextLine();
		sc.close();
		
		System.out.println("Seu nome é " + nome);
	}
}
