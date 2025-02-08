package br.com.gerandofalcoes.turma7.exercicio;
import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		String nomePeca = "";
		String casaLetraAtual = "";
		String casaNumeroAtual = "";
		String casaLetraDestino = "";
		String casaNumeroDestino = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a peca?");
		nomePeca = sc.next();
		
		System.out.println("Qual a letra da casa atual?");
		casaLetraAtual = sc.next();
		
		System.out.println("Qual o numero da casa atual ?");
		casaNumeroAtual = sc.next();
		
		System.out.println("Qual a letra da casa de destino?");
		casaLetraAtual = sc.next();
		
		System.out.println("Qual o numero da casa de destino?");
		casaNumeroAtual = sc.next();
		
		switch (nomePeca) {
		case "rei": {
			if(casaNumeroAtual == casaNumeroDestino) {
				
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + nomePeca);
		}
		
		sc.close();
		
	}
}
