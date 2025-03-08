package br.com.gerancofacloes.oracle.turma7.falconflix;

import java.util.Scanner;

public class TelaInicial {
	
	public void mostrarOpcoes() {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("==========================================");
		System.out.println("FalconFlix");
		System.out.println("==========================================");
		System.out.println("Digite uma opção:");
		System.out.println("0 - Sair");
		System.out.println("1 - Logar");
		System.out.println("2 - Recuperar senha");
		System.out.println("3 - Cadastrar");
		
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 0: 
			apresentarSaida();
			break;
		case 1: 
			apresentarLogin();
			break;
		case 2: 
			apresentarRecuperarSenha();
			break;
		case 3: 
			apresentarCadastro();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
		sc.close();
		
	}
	
	private void apresentarSaida() {
		System.out.println("Tem certeza? Até mais.");
	}
	
	private void apresentarLogin() {
		System.out.println("Informe seu e-mail ou número do celular");
		System.out.println("Informe senha");
		System.out.println("OU");
		System.out.println("Código de acesso");
		System.out.println("OU");
		System.out.println("QRCode");
	}

	private void apresentarCadastro() {
		TelaCadastro tCadastro = new TelaCadastro();
		tCadastro.apresentar();
	}

	private void apresentarRecuperarSenha() {
		System.out.println("Esqueci minha senha");
	}

}
