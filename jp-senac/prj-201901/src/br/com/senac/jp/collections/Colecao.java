package br.com.senac.jp.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Colecao {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("William");
		l.add("Ana");
		l.add("William");
		showE(l);
		l.remove(2);
		showE(l);

		l = new LinkedList<String>();

		l.add("William");
		l.add("Ana");
		l.add("William");
		showE(l);
		l.remove(2);
		showE(l);
		
	}

	private static void showE(List<String> l) {
		System.out.println("-------------");
		for(String s : l)
			System.out.println(s);
	}
	
}
