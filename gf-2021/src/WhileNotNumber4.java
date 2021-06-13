import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WhileNotNumber4 {

	public static void main(String[] args) throws IOException {
		File f = new  File("lista");
		Scanner sc = new Scanner(f);
		
		if(sc.hasNextInt() == true) {
			int numero = sc.nextInt();
			System.out.println("Numero dentro do arquivo: " + numero);			
			
		}
		
		if(sc.hasNextInt() == true) {
			int numero = sc.nextInt();
			System.out.println("Numero dentro do arquivo: " + numero);			
			
		}
	
		if(sc.hasNextInt() == true) {
			int numero = sc.nextInt();
			System.out.println("Numero dentro do arquivo: " + numero);			
			
		}

		
		System.out.println("Encerrou leitura");
		sc.close();
	}
}
