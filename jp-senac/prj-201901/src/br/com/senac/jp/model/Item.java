package br.com.senac.jp.model;

import br.com.senac.jp.map.Categoria;

public class Item {

	
	public int id;
	public String desc;
	public Categoria categoria;
	
	public Item(int i, String string, Categoria idCategoria) {
		this.id = i;
		this.desc = string;
		this.categoria = idCategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Item)obj).id == id;
	}
	
	
}
