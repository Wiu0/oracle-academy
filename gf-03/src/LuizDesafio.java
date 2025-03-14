import java.util.Scanner;

public class LuizDesafio {

	
	static double pegarPesoNotaAluno(Scanner entrada, int numeroBi) {
		System.out.println("Qual o peso da nota do " + numeroBi + " Bimestre");
		double pesoNota = entrada.nextDouble();
		while (pesoNota < 0) {
			System.out.println("Número invalido digite a Nota do peso novamente");
			pesoNota = entrada.nextDouble();
		}
		
		return pesoNota;
	}
	
	static double pegarNotaAluno(Scanner sc) {
		System.out.println("Qual a nota no x bimestre");
		double nota = sc.nextDouble();
		while (nota > 10 || nota < 0) {
			System.out.println("Número invalido digite a nota novamente");
			nota = sc.nextDouble();
		}
		return nota;
	}
	
	static void imprimirAprovadoReprovado(double media) {
		if(media < 5) {
			System.out.println("Reprovado(a)");
		}else {
			System.out.println("Aprovado(a)");
		}
	}
	
	static void mediaAluno() {
		Scanner sc = new Scanner(System.in);
				

		double pesoNota1 = pegarPesoNotaAluno(sc, 1);
		double pesoNota2 = pegarPesoNotaAluno(sc, 2);
		double pesoNota3 = pegarPesoNotaAluno(sc, 3);
		double pesoNota4 = pegarPesoNotaAluno(sc, 4);

		double nota1 = pegarNotaAluno(sc);
		double nota2 = pegarNotaAluno(sc);
		double nota3 = pegarNotaAluno(sc);
		double nota4 = pegarNotaAluno(sc);
			
		double pesoNotas = pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4;
		
		double resultado = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3 + nota4 * pesoNota4)/ pesoNotas;
		System.out.println("Média: " + resultado);
		
		imprimirAprovadoReprovado(resultado);
		
		System.out.println("                       ");
		System.out.println("                       ");
		System.out.println("Registrar outra Escola?");
		System.out.println("                       ");
		System.out.println("9>Não< || QualquerOutroNúmero>Sim<");
		
		double repetir = sc.nextDouble();	
		if(repetir == 9) {
			imprimirCoracao("Obrigado por usar o Serviço");
			sc.close();
		}else {
			mediaAluno();
		}
		
	}
	
	static void imprimirCoracao(String texto) {
		System.out.println("                         ");
		System.out.println("           oo   oo          ");
		System.out.println("          o  o o  o        " + texto);
		System.out.println("          o   o   o        ");
		System.out.println("          o       o        ");
		System.out.println("           o     o         ");
		System.out.println("            o   o          ");
		System.out.println("             o o           ");
		System.out.println("              o           ");
		System.out.println("                         ");
	}
	
	public static void main(String[] args) {
		imprimirCoracao("Bem vindo ao meu programa");
		mediaAluno();
		imprimirCoracao("Valeu pelo programa");
	}
}