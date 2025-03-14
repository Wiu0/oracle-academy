package br.com.gerandofalcoes.oracle.turma7.falconsound;

import java.util.Scanner;

public class TelaRegistroConta {

	private Scanner sc = new Scanner(System.in);
	private Usuario user = new Usuario();
	private UsuarioService usuarioService = new UsuarioService();
	
	private void pedirNome() {
		System.out.println("Nome:");
		user.setNome(sc.nextLine());
	}
	
	private void pedirDataNascimento() {
		System.out.println("Data Nascimento:");
		user.setDataNascimento(sc.nextLine());
	}
	
	private void pedirNumeroTelefone() {
		System.out.println("Numero Telefone:");
		user.setNumeroTelefone(sc.nextLine());
	}
	
	private void pedirEmail() {
		System.out.println("E-mail:");
		user.setEmail(sc.nextLine());
	}

	private void pedirSenha() {
		System.out.println("Senha:");
		user.setSenha(sc.nextLine());
	}
	
	public void cadastrar() {
		pedirNome();
		pedirDataNascimento();
		pedirNumeroTelefone();
		pedirEmail();
		pedirSenha();
		confirmarDadosInformados();
	}
	
	private void confirmarDadosInformados() {
		System.out.println("Confirme seus dados antes de cadastrarmos");
		System.out.println("Nome: " + user.getNome());
		System.out.println("Data Nascimento: " + user.getDataNascimento());
		System.out.println("Telefone: " + user.getNumeroTelefone());
		System.out.println("E-mail: " + user.getEmail());
		System.out.println("Senha: " + user.getSenha());
		System.out.println("Digite 1 para sim e 0 para nao");
		String opcao = sc.nextLine();
		if(opcao.equals("1")) {
			usuarioService.salvar(user);
		}
	}
}
