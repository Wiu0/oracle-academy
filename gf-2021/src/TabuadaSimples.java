import java.util.Scanner;

public class TabuadaSimples {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa o numero da tabuada a ser calculada");
		
		int numeroTabuada = sc.nextInt();
		sc.close();
		
		System.out.println("0 x " + numeroTabuada + " = " + (0 * numeroTabuada));
		System.out.println("1 x " + numeroTabuada + " = " + (1 * numeroTabuada));
		System.out.println("2 x " + numeroTabuada + " = " + (2 * numeroTabuada));
		System.out.println("3 x " + numeroTabuada + " = " + (3 * numeroTabuada));
		System.out.println("4 x " + numeroTabuada + " = " + (4 * numeroTabuada));
		System.out.println("5 x " + numeroTabuada + " = " + (5 * numeroTabuada));
		System.out.println("6 x " + numeroTabuada + " = " + (6 * numeroTabuada));
		System.out.println("7 x " + numeroTabuada + " = " + (7 * numeroTabuada));
		System.out.println("8 x " + numeroTabuada + " = " + (8 * numeroTabuada));
		System.out.println("9 x " + numeroTabuada + " = " + (9 * numeroTabuada));
		System.out.println("10 x "+ numeroTabuada + " = " + (10 * numeroTabuada));
		
	}
}
