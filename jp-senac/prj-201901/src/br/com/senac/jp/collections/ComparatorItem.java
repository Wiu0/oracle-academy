package br.com.senac.jp.collections;

import java.util.Comparator;

import br.com.senac.jp.model.Item;

public class ComparatorItem implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		System.out.println("I1: " + o1.id +  " I2:" + o2.id);
		return o1.id - o2.id;
	}

}
