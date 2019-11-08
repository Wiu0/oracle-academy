package br.com.kroton.aninhada;

import br.com.kroton.aninhada.Pizza.Builder;
import br.com.kroton.professor.Professor;

public class PizzaTeste {

	public static void main(String[] args) {
		Builder b = new Pizza.Builder();
//		Pizza p = new Pizza();
//		p.setQueijo(true);
//		p.setTamanho(50);
//		p.setCalabresa(true);
		b.adicionaCalabresa();
		b.adicionaQueijo();
		b.tamanhoGrande();
		Pizza p = b.build();
		System.out.println("P0: " + p);//System.out.println(p.toString());
		
		Builder b1 = new Pizza.Builder();
		b1.adicionaCalabresa();
		b1.adicionaQueijo();
		b1.tamanhoGrande();
		Pizza p1 = b1.build();
		System.out.println("P1: " + p1);
		
		System.out.println(p.equals(p1));
		System.out.println("p: " + p.hashCode() + " p1: " + p1.hashCode());
		System.out.println(p.equals(new String("William")));

		Professor p2 = new Professor();
		Professor p3 = new Professor();
		System.out.println("p2: " + p2.hashCode() + " p3: " + p3.hashCode());
		
	}

}
