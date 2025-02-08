import java.util.Scanner;

public class SwitchCase {

	// Mostrar o preço do frete pelo estado
	// AM : 35,00
	// GO : 30,00
	// BA : 50,00
	// SP, RJ: 10,00

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uf = sc.next();
		sc.close();

		switch (uf) {
		case "AM":
			System.out.println("Frete é 35,00");
			break;
		case "GO":
			System.out.println("Frete é 30,00");
			break;
		case "BA":
			System.out.println("Frete é 50,00");
			break;
		case "SP":
		case "RJ":
			System.out.println("Frete é 10,00");
			break;
		default:
			System.out.println("Nao ha frete para " + uf);
		}
	}

}
