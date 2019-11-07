package br.com.kroton.aluno;

public class Aluno {

	private String nome;
	private String endereco;
	private short idade;
	private double altura;
	
	
     	
	public Aluno(String nome, String endereco, short idade, double altura) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public short getIdade() {
		return idade;
	}
	public void setIdade(short idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
