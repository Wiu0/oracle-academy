package br.com.gerandofalcoes.oracle.turma7.falconsound;

import java.util.Scanner;

public class TelaLogin {

	private Scanner sc = new Scanner(System.in);

	public String informarEmail() {
		String email = "";
		do {
			System.out.println("Info email");
			email = sc.nextLine();
		} while (email.contains(" ") || !email.contains("@") || email.length() < 3);
			
		return email;
	}

	public String informarSenha() {
		System.out.println("Info senha");
		String senha = sc.nextLine();
		return senha;
	}
	
	

	public void logar() {
		String emailDigitado = informarEmail();
		String senhaDigitado = informarSenha();

		System.out.println(emailDigitado);
		System.out.println(senhaDigitado);
		System.out.println(TelaRegistroConta.getUser().getEmail());
		System.out.println(TelaRegistroConta.getUser().getSenha());
		if(emailDigitado.equals(TelaRegistroConta.getUser().getEmail()) && 
				senhaDigitado.equals(TelaRegistroConta.getUser().getSenha())
				) {
			System.out.println("Bem vindx");
		} else {
			System.out.println("Senha ou email invalido");
		}
		//Ow, esse email e senha é de alguem cadastrado
	}
}
