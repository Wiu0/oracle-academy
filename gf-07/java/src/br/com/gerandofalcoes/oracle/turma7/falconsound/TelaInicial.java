package br.com.gerandofalcoes.oracle.turma7.falconsound;

import java.util.Scanner;

//Modificador de Acesso. public, private, protected, default/blank
public class TelaInicial {

	public void mostrarOpcoes() {
		Scanner sc = new Scanner(System.in);
		int opcao;
	    
		do {
			mostrarFraseInicial();
			cadastrar();
			logar();
			opcao = sc.nextInt();
	
			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				TelaRegistroConta tRegistroConta = new TelaRegistroConta();
				tRegistroConta.cadastrar();
				break;
			case 2:
				System.out.println("Tela de Login");
				TelaLogin tl = new TelaLogin();
				tl.logar();
				break;
			default:
				System.out.println("Unexpected value: " + opcao);
			}
		} while(opcao != 0);
		sc.close();
	}

	private void mostrarFraseInicial() {
		System.out.println("Olá, somos a Falcon Sound.\nDigite um numero para escolher a opcao");
	}

	private void cadastrar() {
		System.out.println("1. Ainda nao tem conta? Cadastrar-se.");
	}

	private void logar() {
		System.out.println("2. Já tem uma conta? Entrar");
	}
}
