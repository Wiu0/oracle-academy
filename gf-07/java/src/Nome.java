import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String nomeUsuario = sc.next();	
//		System.out.println("Seu nome é " + nomeUsuario);
	
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo é " + nomeCompleto);
		sc.close();
	}
}
