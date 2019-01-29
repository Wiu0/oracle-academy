package br.com.senac.jp.generico;

import br.com.senac.jp.classe.Cor2;

public class ListaTeste {

	
	public static void main(String[] args) {
		/*
		 * Lista l = new Lista(); l.add(12); l.add(13); System.out.println(l);
		 * 
		 * Lista l1 = new Lista(); l1.add("aaa12"); l1.add("jhjh");
		 * System.out.println(l1);
		 */
		
		Lista l2 = new Lista();
		l2.add(new Cor2(12));
		l2.add("sadas");
		System.out.println(l2);
		
		if(l2.get(1) instanceof Cor2) {
			Cor2 cc = (Cor2)l2.get(1);
			cc.mostrarCor();
		}else {
			System.out.println("Nao é uma Cor2");
		}
	}
}
