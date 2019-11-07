package br.com.kroton.variavel.string;

public class Texto {

	public static void main(String[] args) {

		String nome = "William ";
		String nome1 = new String("William ");
		boolean seraQueEhIgual = nome == nome1;
		System.out.println(seraQueEhIgual);
		boolean seraQueEhIgualParte2 = nome.equals(nome1);
		System.out.println(seraQueEhIgualParte2);
		
		System.out.println(nome.charAt(0));
		System.out.println(nome.contains("arroz"));
		System.out.println(nome.contains("l"));
		System.out.println(nome.contains("am"));
		System.out.println(nome.contains("ma"));
		System.out.println(nome.contains("AM"));
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toUpperCase().contains("AM"));
		System.out.println(nome.toLowerCase());
		System.out.println(nome.endsWith("Will"));
		System.out.println(nome.endsWith("illiam"));
		System.out.println(nome.startsWith("Will"));
		System.out.println(nome.startsWith("illiam"));
		System.out.println(nome.indexOf("i", 2));
		System.out.println(nome.indexOf("m"));
		System.out.println(nome.indexOf("z"));
		System.out.println(nome.indexOf("il"));
		System.out.println(nome.length());
		System.out.println(nome.replace("i", "y"));
		System.out.println(nome.replace("l", "r"));
		String valores[] = nome.split("i");
		System.out.println(valores[0] + " - " + valores[1] + " - "+valores[2]);
		System.out.println(nome.trim());
		System.out.println(nome.substring(3));
		System.out.println(nome.substring(3, 5));
		System.out.println("DA".compareTo("AA"));
		System.out.println("DB".compareTo("DA"));
		
	}

}
