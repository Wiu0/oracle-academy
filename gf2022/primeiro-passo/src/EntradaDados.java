import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		long idade = sc.nextLong();
		
		int altura = sc.nextInt();
		double salario = sc.nextDouble();
		sc.nextByte();
		String nome = sc.next();

		idade = sc.nextLong();
		idade = 13;
		idade = sc.nextInt();
		sc.close();
		
		System.out.println("Parabens: " + nome);
		System.out.println("Vc ganhou " + (altura * idade * salario));
		
	}
}
