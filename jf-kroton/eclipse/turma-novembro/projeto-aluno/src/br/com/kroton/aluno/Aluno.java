package br.com.kroton.aluno;

import java.io.Closeable;
import java.io.IOException;

import br.com.kroton.scanner.RegraAcessoSala;
import br.com.kroton.usuario.Usuario;

public class Aluno extends Usuario implements RegraAcessoSala, Closeable{

	private String endereco;
	private short idade;
	private double altura;
     	
	
	/*
	 * @Override public String getNome() { return "ARROZ "; }
	 */
	
	/*
	 * public int nivelDeAcesso() { return 0; }
	 */
	@Override
	public int getNivelDeAcesso() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public Aluno(String nome, String endereco, short idade, double altura) {
		super();
		setNome(nome);
		this.endereco = endereco;
		this.idade = idade;
		this.altura = altura;
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

	@Override
	public void comparacer() {
		System.out.println("Entrar sentar na cadeira de aluno");
		
	}

	@Override
	public void close() throws IOException {
		//Fechar conexao banco
		//fechar buffer do arquivo texto
		
		
	}

	
}
