package br.com.kroton.scanner;

import java.util.Scanner;

import br.com.kroton.aluno.Aluno;

//Nome String, Endereco String, idade short, double altura.
public class Cadastro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\\Instituição Teste \n\tCadastro de \"Aluno\"");
		System.out.println("================================================");

		System.out.println("Qual seu nome?");
		String nome = sc.nextLine();

		System.out.println("Qual seu endereço");
		String endereco = sc.nextLine();	

		System.out.println("Qual sua idade");
		short idade = Short.parseShort(sc.nextLine());

		System.out.println("Qual sua altura");
		double altura = Double.parseDouble(sc.nextLine());

		Aluno aluno = new Aluno(nome, endereco, idade, altura);
		System.out.println("Bem vindo " + aluno.getNome());
		sc.close();

	}
}
