import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número a ser multiplicado");
		int numero = scan.nextInt();
		
		System.out.println("Quantas vezes o número será multiplicado?");
		int limiteLaco = scan.nextInt();
		
		scan.close();
		
		for (int i = 0; i <= limiteLaco; i++) {
			System.out.print(numero + " x " + i + " = ");
			System.out.println(numero * i);
		}
		
		
		for(;;) {
			
			System.out.println("Aaiiiiiddd");
			for(;;) {
				System.out.println("fdfdsfds");
			}
			
		}
			
		
	}
}
