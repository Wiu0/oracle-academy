package br.com.senac.jp.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Conjunto {

	
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("William");
		s.add("Ana");
		s.add("William");
		show(s);
		s = new LinkedHashSet<String>();
		s.add("William");
		s.add("Ana");
		s.add("William");
		show(s);
	}

	private static void show(Set<String> s) {
		System.out.println("-------------");
		for(String ss : s) System.out.println(ss);
	}
}
