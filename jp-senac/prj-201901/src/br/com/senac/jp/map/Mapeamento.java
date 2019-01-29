package br.com.senac.jp.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import br.com.senac.jp.model.Item;

public class Mapeamento {

	public static void main(String[] args) {
		Map<Integer, Item> aluno = new HashMap<Integer, Item>();
		aluno.put(3, new Item(123,"Maca", Categoria.ALIMENTOS));
		aluno.put(1, new Item(124,"Leite", Categoria.ELETROS));
		aluno.put(2, new Item(12,"Arroz", Categoria.HIGIENE));
//		System.out.println(aluno.get(3).desc);
		show(aluno);
		aluno = new LinkedHashMap<Integer, Item>();
		aluno.put(3, new Item(123,"Maca", Categoria.ALIMENTOS));
		aluno.put(1, new Item(124,"Leite", Categoria.ELETROS));
		aluno.put(2, new Item(12,"Arroz", Categoria.HIGIENE));
		show(aluno);
	}

	private static void show(Map<Integer, Item> aluno) {
		System.out.println("----------------");
		for(Item i : aluno.values())
			System.out.println(i.desc);
	}
}
