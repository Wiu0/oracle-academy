package br.com.gerandofalcoes.oracle.turma7.duvidas;

import java.util.Date;
import java.util.Scanner;

public class Texto {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//aprenderEnderecoString();
	
		Carro c0 = new Carro();
		c0.cor = "azul";
		c0.quantidadeJanelas = 2;
		c0.tamanho = "pequeno";
		
		Carro c1 = new Carro();
		c1.cor = "azul";
		c1.quantidadeJanelas = 3;
		c1.tamanho = "pequeno";
		
		if(c0 == c1) {
			System.out.println("iguais");
		} else {
			System.out.println("diff");
		}
		
		if(c0.equals(c1)) {
			System.out.println("Sim");
		} else {
			System.out.println("Nao");
		}
		
	}

	private static void aprenderEnderecoString() {
		String nome0 = "Wiu";//sc.nextLine();
		String nome1 = new String("Wiu");//sc.nextLine();

		if(nome0 == nome1) { // == Compara endereco na memoria
			System.out.println("nomes sao iguais");
		} else {
			System.out.println("nomes sao diferentes");
		}
		
		if(nome0.equals(nome1)) { // equals compara o valor que esta dentro da variavel, o texto em si
			System.out.println("nomes sao iguais");
		} else {
			System.out.println("nomes sao diferentes");
		}
	}
	
	
}
