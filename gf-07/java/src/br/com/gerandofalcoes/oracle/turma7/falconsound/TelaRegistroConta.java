package br.com.gerandofalcoes.oracle.turma7.falconsound;

import java.util.Scanner;

public class TelaRegistroConta {

	Scanner sc = new Scanner(System.in);
	String nome;
	
	private void pedirNome() {
		System.out.println("Nome:");
		nome = sc.nextLine();
	}
	private void pedirNumeroTelefone() {
		System.out.println("Numero Telefone:");
		String numeroTelefone = sc.nextLine();
	}
	
	public void cadastrar() {
		pedirNome();
		pedirNumeroTelefone();
		confirmarDadosInformados();
	}
	
	private void confirmarDadosInformados() {
		System.out.println("Confirme seus dados antes de cadastrarmos");
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: ");
	}
}
