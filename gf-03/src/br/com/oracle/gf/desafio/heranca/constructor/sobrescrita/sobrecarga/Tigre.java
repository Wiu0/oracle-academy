package br.com.oracle.gf.desafio.heranca.constructor.sobrescrita.sobrecarga;

public class Tigre extends Felino{

	public Tigre(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Tigre faz IIII");
	}
}