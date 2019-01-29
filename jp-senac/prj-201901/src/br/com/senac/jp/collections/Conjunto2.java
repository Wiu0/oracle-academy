package br.com.senac.jp.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.senac.jp.map.Categoria;
import br.com.senac.jp.model.Item;

public class Conjunto2 {

	public static void main(String[] args) {
		List<Item> i = new ArrayList<Item>();
		i.add(new Item(12, "Arroz", Categoria.ALIMENTOS));
		i.add(new Item(13, "feijao", Categoria.ELETROS));
		i.add(new Item(14, "Maca", Categoria.HIGIENE));
		i.add(new Item(1, "Suco", Categoria.ALIMENTOS));
		show(i);
		
		/*
		 * i.sort(new Comparator<Item>() {
		 * 
		 * @Override public int compare(Item o1, Item o2) { System.out.println("I1: " +
		 * o1.id + " I2:" + o2.id); return o1.id - o2.id; } });
		 */
		i.sort(new ComparatorItem());
		show(i);
	}

	private static void show(List<Item> i) {
		for(Item ii : i)
			System.out.println(ii.id + " - " + ii.desc);
	}
}
