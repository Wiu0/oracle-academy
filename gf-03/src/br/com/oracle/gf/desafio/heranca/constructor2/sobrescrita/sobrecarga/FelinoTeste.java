package br.com.oracle.gf.desafio.heranca.constructor2.sobrescrita.sobrecarga;

public class FelinoTeste {

	public static void main(String[] args) {
		Felino f = new Felino("mmmm");
		f.emitirSom();
		
		Leao l = new Leao();
		l.emitirSom();
		
		Tigre t = new Tigre();
		
		t.emitirSom();
		
		Gato g = new Gato("Miau");
		g.emitirSom();
	}
}
