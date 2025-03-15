package br.com.gerandofalcoes.oracle.turma7.falconsound;

import java.util.Scanner;

public class TelaLogin {

	private Scanner sc = new Scanner(System.in);
	private LoginService loginService = new LoginService();

	private String informarEmail() {
		String email = "";
		do {
			System.out.println("Info email");
			email = sc.nextLine();
		} while (email.contains(" ") || !email.contains("@") || email.length() < 3);

		return email;
	}

	private String informarSenha() {
		System.out.println("Info senha");
		String senha = sc.nextLine();
		return senha;
	}

	public void logar() {
		Usuario u = new Usuario();
		u.setEmail(informarEmail());
		u.setSenha(informarSenha());

		if (loginService.logar(u)) {
			System.out.println("login sucesso");
		} else {
			System.out.println("Login falha");
		}
	}
}