import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) throws FileNotFoundException {
//		System.out.println("5x0 = 50\n5x1 = 5\n5x2 = 10\n");
//		
//		System.out.println("5x0 = 50");
//		System.out.println("5x1 = 5");
//		System.out.println("5x2 = 10");
//		System.out.println("5x3 = 15");
//		System.out.println("5x4 = 20");
//		System.out.println("5x5 = 25");
//		System.out.println("5x6 = 30");
//		System.out.println("5x7 = 35");
//		System.out.println("5x8 = 40");
//		System.out.println("5x9 = 45");
//		System.out.println("5x10 = 50");

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println("Oi");
			System.out.println("Ate");
		}
		
		int j = 6;
		while(j < 3) {
			System.out.println("oiui");
			j++;
		}
//		
//		Scanner sc = new Scanner(new File("/aula/chamada.txt"));
//		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
//		sc.close();
		Scanner sc1 = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Digite 1 - Cadastro");
			System.out.println("Digite 2 - Vendas");
			System.out.println("Digite 0 - Sair");
			opcao = sc1.nextInt();
		} while(opcao != 0);
		sc1.close();
	}

//	public static void main(String[] args) {
//		int tabuada = 5;
//		for(int i = 0; i < 11; i++) {
//			System.out.println(tabuada + " x " + i + " = " + (tabuada*i));			
//		}
//	}
}
