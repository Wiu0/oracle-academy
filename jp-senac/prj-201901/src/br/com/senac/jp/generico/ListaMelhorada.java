package br.com.senac.jp.generico;

public class ListaMelhorada<T> {
	
	T[] lista;
	int tamanho;
	int index;
	
	public ListaMelhorada() {
		lista = (T[]) new Object[10];
	}
	
	
	public void add(T i) {
		resize();
		lista[index++] = i;
	}

	public T get(int index) {
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
