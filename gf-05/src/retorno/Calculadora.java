package retorno;

import java.util.Scanner;

public class Calculadora {

	static double var1;
	static double var2;
		
	public static double somar() {
		double resultadoDaSoma = var1 + var2;
		return resultadoDaSoma;
	}
	
	public static double multiplicar() {
		double resultadoDaSoma = var1 * var2;
		return resultadoDaSoma;
	}
	
	
	public static boolean var1EhMaiorQueVar2() {
		boolean resultadoComparacao = var1 > var2;
		return resultadoComparacao;
	}
	
	public static void fazAlgo() {
		System.out.println("Algo");
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextDouble();
		var2 = sc.nextDouble();
		sc.close();
		
		double resultado = somar();
		System.out.println(resultado);
		

		boolean resultadoB = var1EhMaiorQueVar2();
		System.out.println(resultadoB);
		
		fazAlgo();
		
		
		
	}
}
