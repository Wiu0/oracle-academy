package br.com.oracle.gf.desafio.heranca.constructor.sobrescrita.sobrecarga;

public class FelinoTeste {

	public static void main(String[] args) {
		Felino f = new Felino(10);
//		f.setPeso(10);
		f.emitirSom();
		System.out.println(f.getPeso());
		
		Leao l = new Leao(100);
//		l.setPeso(100);
		l.emitirSom();
		System.out.println(l.getPeso());
		
		Tigre t = new Tigre(102);
//		t.setPeso(102);
		t.emitirSom();
		System.out.println(t.getPeso());
		
		Gato g = new Gato(2);
//		g.setPeso(2);
		g.emitirSom();
		System.out.println(g.getPeso());
	}
}
