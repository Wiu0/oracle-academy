package desafio.facil;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Academia {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("**********************************");
		System.out.println("Bem vindo Academia GF");
		System.out.println("**********************************");
		System.out.println("Qual seu nome?");
		String aluno = sc.next();
		
		System.out.println("Qual seu ano de nascimento?");
		int anoNascimento = sc.nextInt();
		
		int anoMin = OffsetDateTime.now().getYear() - 18;
		if(anoNascimento < anoMin) {
			cadastradoComSucesso();
		} else {
			System.out.println("Responsavel concorda?");
			String resposta = sc.next();
			if(resposta.equals("sim") || resposta.equals("ok") || resposta.equals("claro")) {
				cadastradoComSucesso();
			} else {
				System.out.println(aluno + " nao cadastrada");	
				
			}			
		}
				
		sc.close();
	}
	
	public static void cadastradoComSucesso() { 
//		System.out.println(aluno + " cadastrada");	
//		System.out.println("Informe a qtd meses");
//		int qtdMeses = sc.nextInt();
//		double custoMensal = 99.9;
//		double custoTotal = qtdMeses * custoMensal;
//		System.out.println("Custo Total: " + custoTotal);
//		System.out.println("Custo Mensal: " + custoMensal);
//		
//		if(qtdMeses >= 12) {
//			double desconto = custoTotal * 0.1;
//			System.out.println("Desc: " + desconto);
//			double novoVlrTt = custoTotal - desconto;
//			System.out.println("Vc vai pagar:" + novoVlrTt);
//		}
	}
}




