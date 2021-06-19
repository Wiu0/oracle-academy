package laco_repeticao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WhileNotNumber2 {

	public static void main(String[] args) throws IOException {
		File f = new  File("lista");
		Scanner sc = new Scanner(f);
		
		for(int i = 0; i < 100; i++) { 
			int numero = sc.nextInt();
			System.out.println("Numero dentro do arquivo: " + numero);
		}
		
		sc.close();
	}
}
