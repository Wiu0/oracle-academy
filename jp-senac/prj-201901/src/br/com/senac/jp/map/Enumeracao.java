package br.com.senac.jp.map;

import br.com.senac.jp.model.Item;

public class Enumeracao {

	public static void main(String[] args) {
		Item i = new Item(12, "Arroz", Categoria.ALIMENTOS);
		
		//if(i.idCategoria == 12) {
		switch (i.categoria) {
		case ALIMENTOS:
			
			break;
		case ELETROS:
			
			break;
		case HIGIENE:
			
			break;
		default:
			break;
		}
		if(i.categoria == Categoria.ALIMENTOS) {
			System.out.println("Nao sei");
		}else{
			System.out.println("Nao sei tbm");
		}
	}
}
