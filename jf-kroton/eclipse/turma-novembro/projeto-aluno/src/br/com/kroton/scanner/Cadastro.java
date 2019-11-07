package br.com.kroton.scanner;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Texto ");
		String texto = sc.nextLine();
		System.out.println("Texto digitado: " + texto);
		sc.close();
		
	}

}
