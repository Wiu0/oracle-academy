package br.com.senac.jp.classe;

import java.util.ArrayList;

public final class Pedido {

	public final int valor;
	public java.util.List<String> adicionais = new ArrayList<String>();
	private String cliente;
	
	public void addAdicional(String adicional) {
		adicionais.add(adicional);
	}
	
	
	private Pedido(int valor) {
		this.valor = valor;
	}

	public final void mostrarCor() {
		System.out.println("Verde");
	}
	
	static class Builder{
		Pedido c = new Pedido(12);

		public Builder com(String adicional) {
			c.addAdicional(adicional);
			return this;
		}

		public Builder para(String cliente) {
			c.setCliente(cliente);
			return this;
		}

		public Pedido fazerPedido() {
			return c;
		}
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
