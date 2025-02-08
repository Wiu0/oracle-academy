package laco_repeticao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WhileNotNumber3 {

	public static void main(String[] args) throws IOException {
		File f = new  File("lista");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextInt() == true) {
			int numero = sc.nextInt();
			System.out.println("Numero dentro do arquivo: " + numero);			
		}
		
		System.out.println("Encerrou leitura");
		sc.close();
	}
}
