import java.util.Scanner;

public class TabuadaMedia {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa o numero da tabuada a ser calculada");

		int numeroTabuada = sc.nextInt();
		sc.close();

		for(int i = 0; i < 11; i++) {
			System.out.println(i + " * " + numeroTabuada + " = " + (i * numeroTabuada));
		}

		int i = 0;
		while(i < 11) {
			System.out.println(i + " * " + numeroTabuada + " = " + (i * numeroTabuada));
			i++;
		}

		do {
			System.out.println(i + " * " + numeroTabuada + " = " + (i * numeroTabuada));
			i++;
		} while(i < 11);
	}
}
