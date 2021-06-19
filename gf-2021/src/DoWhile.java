import java.io.IOException;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) throws IOException {
		
		Scanner sc  = new Scanner(System.in); 
		int opcao;
		
		do {
			System.out.println("Escolha uma opcao abaixo");
			System.out.println("1 - Calcular a idade media da casa");
			System.out.println("2 - Calcular a custos da casa");
			System.out.println("3 - Calcular a media das notas");
			System.out.println("0 - encerrar o programar");
			
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				int idade1 = sc.nextInt(), idade2 = sc.nextInt();
				int idade3 = sc.nextInt();
				System.out.println("Media na casa é : " + (idade1 + idade2 + idade3)/3);
			}
			
			if(opcao == 2) {
				
			}
			
		} while(opcao != 0);
	
		sc.close();
	}
}