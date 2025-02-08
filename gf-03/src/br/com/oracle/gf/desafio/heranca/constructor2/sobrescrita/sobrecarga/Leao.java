package br.com.oracle.gf.desafio.heranca.constructor2.sobrescrita.sobrecarga;

public class Leao extends Felino {

	public Leao() {
		super("AAAAAA");
	}

	@Override
	public void emitirSom() {
		System.out.println("Leao faz " + som);
	}
}
