package br.com.gerancofacloes.oracle.turma7.falconflix;

import java.util.Scanner;

public class TelaCadastro {

	Scanner sc = new Scanner(System.in);
	String nome;

	public void apresentar() {
		
		System.out.println("Filmes, séries e muito mais, sem limites");
		System.out.println("A partir de R$ 20,89. Cancele quando quiser.");
		System.out.println("Quer assistir? Informe seu email para criar ou reiniciar sua assinatura.");
		
		pedirNome();
		pedirDataNascimento();
		pedirCPF();
		pedirEmail();
		pedirNumeroCelular();
		pedirNomeConformeCartao();
		pedirNumeroCartao();
		pedirCVCCartao();
		pedirDataValidadeCartao();
		pedirCEP();
		pedirSenha();
		confirmarSenha();
		
		mostrarDadosInformados();
		
	}
	
	public void mostrarDadosInformados() {
		System.out.println("Confirma os dados abaixo");
		System.out.println("Nome:" + nome);
	}
	
	private void pedirCEP() {
		System.out.println("CEP:");
	}
	
	private String pedirNome() {
		System.out.println("Nome:");
		nome = sc.nextLine();
		return nome;
	}
	
	private void pedirCPF() {
		System.out.println("CPF:");
	}
	
	private void pedirDataNascimento() {
		System.out.println("Data Nascimento:");
	}

	private void pedirNumeroCartao() {
		System.out.println("NumeroCartao:");
	}

	private void pedirNomeConformeCartao() {
		System.out.println("Nome conforme cartao:");
	}

	private void pedirCVCCartao() {
		System.out.println("CVC:");
	}
	
	private void pedirDataValidadeCartao() {
		System.out.println("Validade:");
	}
	
	private void pedirNumeroCelular() {
		System.out.println("Numero Celular:");
	}

	private void pedirEmail() {
		System.out.println("Email:");
	}

	private void pedirSenha() {
		System.out.println("Senha:");
	}

	private void confirmarSenha() {
		System.out.println("Confirmar Senha:");
	}

}
