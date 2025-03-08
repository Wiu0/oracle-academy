package br.com.gerandofalcoes.oracle.turma7.falconsound;

public class Usuario {

	private String nome;
	private String dataNascimento;
	private String numeroTelefone;
	private String email;
	private String senha;
	
	public void setNome(String name) {
		nome = name;
	}
	
	public void setDataNascimento(String birthDate) {
		dataNascimento = birthDate;
	}
	
	public void setNumeroTelefone(String cellPhoneNumber) {
		numeroTelefone = cellPhoneNumber;
	}
	
	public void setEmail(String emailAddress) {
		email = emailAddress;
	}
	
	public void setSenha(String password) {
		senha = password;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
}
