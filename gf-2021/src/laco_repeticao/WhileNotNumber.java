package laco_repeticao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WhileNotNumber {

	public static void main(String[] args) throws IOException {
		File f = new  File("lista");
		Scanner sc = new Scanner(f);
		
		int numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);

		//Problema
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
	
		//Problema
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		//Problema
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		//Problema
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		//Problema
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		//Problema
		numero = sc.nextInt();
		System.out.println("Numero dentro do arquivo: " + numero);
		
		
		sc.close();
	}
}
