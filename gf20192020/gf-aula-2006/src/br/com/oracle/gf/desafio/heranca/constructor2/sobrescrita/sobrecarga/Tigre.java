package br.com.oracle.gf.desafio.heranca.constructor2.sobrescrita.sobrecarga;

public class Tigre extends Felino{

	
	
	public Tigre() {
		super("IIII");
	}

	@Override
	public void emitirSom() {
		System.out.println("Tigre faz " + som);
	}
}