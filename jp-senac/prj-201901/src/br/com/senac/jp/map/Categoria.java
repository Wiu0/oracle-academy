package br.com.senac.jp.map;

public enum Categoria {
	
	ALIMENTOS(12, "Alimentos"),
	ELETROS(1, "Eletro"),
	HIGIENE(2, "Hig");

	public final long id;
	public final String desc;
	
	Categoria(long id, String desc) {
			this.id = id;
			this.desc = desc;
	}
	
	public static void main(String[] args) {
		for(Categoria c : Categoria.values()) {
			System.out.println(c.id);
		}
		System.out.println(Categoria.values()[2]);
	}
}
