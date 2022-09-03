import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		long idade = sc.nextLong();
		int aa = sc.nextInt();
		String nome = sc.next();

		sc.close();
		
		System.out.println("Parabens: " + nome);
		System.out.println("Vc ganhou " + (aa * idade));
		
	}
}
