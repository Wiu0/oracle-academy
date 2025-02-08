package br.com.oracle.gf.desafio.heranca.constructor.sobrescrita.sobrecarga;

public class Gato extends Felino {

	public Gato(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Gato faz miau");
	}
}
