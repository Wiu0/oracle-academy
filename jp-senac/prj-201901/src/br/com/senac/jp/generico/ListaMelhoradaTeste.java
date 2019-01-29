package br.com.senac.jp.generico;import br.com.senac.jp.classe.Cor;
import br.com.senac.jp.classe.Cor2;

public class ListaMelhoradaTeste {

	public static void main(String[] args) {
		ListaMelhorada<Cor> l = new ListaMelhorada<Cor>();
		l.add(new Cor2(12));
		l.add(new Cor(123));
		System.out.println(l.get(0));
	}
	
}
