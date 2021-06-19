package tabuada;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabuadaDo = sc.nextInt();
		System.out.println("Tabuada do " + tabuadaDo);
		System.out.println("=============================");
		for(int i = 1; i < 11; i++) {
			System.out.println(i + " x " + tabuadaDo + " = " + (i * tabuadaDo));
		}
		System.out.println("=============================");
		sc.close();
	}
}
