package br.com.senac.jp.classe;

public class Cor2 extends Cor{

	/*
	 * @Override public void mostrarCor() { System.out.println("Verde escuro"); }
	 */
		
	public Cor2(int valor) {
		super(valor);
	}

	public static void main(String[] args) {
		Cor2 c = new Cor2(123);
//		c.valor = 12;
		mostrarResul(c);
	}
	
	public static void mostrarResul(Cor c) {
		c.mostrarCor();
	}
}
