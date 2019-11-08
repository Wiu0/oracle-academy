package br.com.kroton.usuario;

public abstract class Usuario {

	private String nome;

	/*
	 * public int getNivelDeAcesso() { return -1; }
	 */
	public abstract int getNivelDeAcesso();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}		
}
