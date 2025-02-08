package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int tabuadaDo = capturarDado();

		System.out.println("Tabuada do " + tabuadaDo);
		System.out.println("=============================");
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + tabuadaDo + " = " + (i * tabuadaDo));
		}
		System.out.println("=============================");
	}

	private static int capturarDado() {
		Scanner sc = new Scanner(System.in);
		int tabuadaDo = sc.nextInt();
		sc.close();
		return tabuadaDo;
	}

}
