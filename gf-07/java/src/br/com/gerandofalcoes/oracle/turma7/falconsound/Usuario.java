package br.com.gerandofalcoes.oracle.turma7.falconsound;

public class Usuario {

	private String nome;
	private String dataNascimento;
	private String numeroTelefone;
	private String email;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		nome = name;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String birthDate) {
		dataNascimento = birthDate;
	}

	public void setNumeroTelefone(String cellPhoneNumber) {
		numeroTelefone = cellPhoneNumber;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailAddress) {
		email = emailAddress;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String password) {
		senha = password;
	}

}
