import java.util.Scanner;

public class MetodoAreaDesafio {

	public static void mostrarApresentacaoInicial(String nome) {
		String boasVindas = "Bem vindo ao calculador de areas " + nome;
		System.out.println("===========================================");
		System.out.println(boasVindas);
		System.out.println("Iremos calcular as areas: ");
		System.out.println("Quadrado");
		System.out.println("Circulo");
		System.out.println("Retangulo");
		System.out.println("===========================================\n");	
	}
	
	public static double pegarLado(Scanner sc, String forma) {
		System.out.println("Informe o lado " + forma + ":");
		double lado = sc.nextDouble();
		return lado;
	}
	
	public static double pegarRaio(Scanner sc) {
		System.out.println("Informe o raio:");
		double raio = sc.nextDouble();
		return raio;
	}

	public static double calcularAreaRetangulo(double altura, double largura) {
		return altura * largura;
	}
	
	public static double calcularAreaCirculo(double raio) {
		return Math.PI * raio * raio;
	}

	private static void mostrarAreasCalculadas(double areaQuadrado, double areaCirculo, double areaRetangulo) {
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println("Área do círculo: " + areaCirculo);
		System.out.println("Área do retângulo: " + areaRetangulo);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mostrarApresentacaoInicial("Wiu");

		double ladoQuadrado = pegarLado(sc, "Quadrado");
		double raioCirculo = pegarRaio(sc);
		double larguraRetangulo = pegarLado(sc, "Retangulo");
		double alturaRetangulo = pegarLado(sc, "Retangulo");
		
		double areaQuadrado = calcularAreaRetangulo(ladoQuadrado, ladoQuadrado);
		double areaCirculo = calcularAreaCirculo(raioCirculo);
		double areaRetangulo = calcularAreaRetangulo(larguraRetangulo, alturaRetangulo);
		
		mostrarAreasCalculadas(areaQuadrado, areaCirculo, areaRetangulo);
	}

}