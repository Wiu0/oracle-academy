package br.com.oracle.gf.desafio.heranca.constructor.sobrescrita.sobrecarga;

public class Leao extends Felino {

	public Leao(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Leao faz AAAAA");
	}
}
