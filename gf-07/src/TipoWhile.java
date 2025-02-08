import java.util.Scanner;

public class TipoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner("Diario.txt");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();		
	}
}
