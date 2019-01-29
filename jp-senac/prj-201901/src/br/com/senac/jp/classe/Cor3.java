package br.com.senac.jp.classe;

public class Cor3 /* extends CorDef */{

	public static void main(String[] args) {
		Pedido p = 
				new Pedido.Builder().
				com("Tomate").
				com("Cebola").
				com("Queijo").
				para("Wiu").
				fazerPedido();
//		Pedido p1 = new Pedido();
//		p.addAdicional("Tomate");
//		p.addAdicional("Cebola");
//		p.addAdicional("Queijo");
//		p.setCliente("Wiu");
//		
	}
}
