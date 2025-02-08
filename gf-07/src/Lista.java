import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		String fruta = "uva";
		fruta = "maca";
		System.out.println(fruta);
		
		List<String> frutas = new ArrayList<>();
		frutas.add("Maca");
		frutas.add("uva");
		
		System.out.println(frutas.get(1));
		
		
		int idades[] = new int[10];
		idades[0] = 32;
		idades[1] = 2;
		idades[9] = 3;
		idades[5] = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastrar Filmes");
		System.out.println("Informe o filme 1");
//		String filme1 = sc.next();
		
//		System.out.println("Informe o filme 2");
//		String filme2 = sc.next();
//		
//		System.out.println("Informe o filme 3");
//		String filme3 = sc.next();
//		
//		System.out.println("Lista Filmes:");
//		System.out.println(filme1);
//		System.out.println(filme2);
//		System.out.println(filme3);
//		
		String nome = "Wiu";
		String filmes[] = new String[3];
		filmes[0] = "Wiu";
		filmes[1] = "Pedro";
		filmes[2] = "Ana";
		
		System.out.println("Lista");
		System.out.println(filmes[2]);
		System.out.println(filmes[0]);
		System.out.println(filmes[1]);
		filmes[2] = "Bia";
		
		sc.close();
	}
}
