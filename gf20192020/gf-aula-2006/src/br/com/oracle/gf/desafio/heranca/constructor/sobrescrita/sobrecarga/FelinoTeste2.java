package br.com.oracle.gf.desafio.heranca.constructor.sobrescrita.sobrecarga;

public class FelinoTeste2 {

	public static void main(String[] args) {
		Felino f = new Felino(1);
//		f.setPeso(1);
		f.emitirSom();
		System.out.println("O peso é: " + f.getPeso());
		
		Leao l = new Leao(12);
//		l.setPeso(12);
		l.emitirSom();
		System.out.println("O peso é: " + l.getPeso());
		
		Tigre t = new Tigre(80);
//		t.setPeso(80);
		t.emitirSom();
		System.out.println("O peso é: " + t.getPeso());
		
		Gato g = new Gato(2);
//		g.setPeso(2);
		g.emitirSom();
		System.out.println("O peso é: " + g.getPeso());
	}
}
