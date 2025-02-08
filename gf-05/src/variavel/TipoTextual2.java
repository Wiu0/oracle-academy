package variavel;
import java.util.Scanner;

public class TipoTextual2 {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("1-Cadastrar cliente");
			System.out.println("2-Cadastrar produto");
			System.out.println("3-Cadastrar fornecedor");
			System.out.println("0-Sair");
			opcao = sc.nextInt();
			System.out.println("Opcao " + opcao);
			
		}while (opcao != 0);		
		sc.close();
		
	}
                                            
	
}
