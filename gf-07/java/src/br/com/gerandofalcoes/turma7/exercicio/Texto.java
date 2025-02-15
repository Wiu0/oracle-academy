package br.com.gerandofalcoes.turma7.exercicio;
import java.util.Scanner;

public class Texto {
	public static void main(String[] args) {
		char caracterer = 'W';
		System.out.println(caracterer);
		String nome = "WiLLiam";
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.charAt(0));
		System.out.println(nome.indexOf("a"));
		
		Scanner sc = new Scanner(System.in);
		nome = sc.next();
		System.out.println("Texto digitado foi:" + nome);
	}
}