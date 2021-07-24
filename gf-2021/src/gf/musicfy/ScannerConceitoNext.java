package gf.musicfy;

import java.util.Scanner;

/*
 * Entrada de dados
 * 34 100 1
 * Saida
 * 135
 * 
 * Entrada de dados
 * 77 3 200
 * Saida
 * 280
 * 
 */
public class ScannerConceitoNext {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b2 = sc.nextInt();
		int c3 = sc.nextInt();
		sc.close();
		int res = somarValores(a1, b2 , c3);
		System.out.println(res);
	
	}
	
	static int somarValores(int a, int b, int c) {
		int resultado;
		resultado = a + b + c;
		return resultado;
	}

}
