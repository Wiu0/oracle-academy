package br.com.senac.jp.generico;

public class Lista {

	Object[] lista;
	int tamanho;
	int index;
	
	public Lista() {
		lista = new Object[10];
	}
	
	
	public void add(Object i) {
		resize();
		lista[index++] = i;
	}

	public Object get(int index) {
		return lista[index];
	}

	private void resize() {
		//redimensionado lista
	}
	
	@Override
	public String toString() {
		String numeros = "";
		for(int i = 0; i < index; i++) 
			numeros += lista[i] + ","  ;
		return numeros;
	}
}
