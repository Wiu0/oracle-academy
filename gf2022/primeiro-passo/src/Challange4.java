import java.util.Scanner;

public class Challange4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\tPercentual GF");
		System.out.println("Informe o total gasto");
		double peca = sc.nextDouble();
		System.out.println("Informe o total gasto com alimentacao");
		double alimentacao = sc.nextDouble();

		System.out.println("Informe o total gasto com higiene");
		double higiene = sc.nextDouble();
		

		System.out.println("Informe o total gasto com itens para casa");
		double itensParaCasa = sc.nextDouble();
		
		
		System.out.println((alimentacao/peca * 100) + " % gasto com alimentacao");
		System.out.println((higiene/peca * 100) + " % gasto com higiene");
		System.out.println((itensParaCasa/peca * 100) + " % gasto com itens para casa");
	}
	
}
