package br.com.oracle.gf.desafio.heranca.constructor2.sobrescrita.sobrecarga;

public class Gato extends Felino {


	public Gato(String som) {
		super(som);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Gato faz miau");
	}
}
