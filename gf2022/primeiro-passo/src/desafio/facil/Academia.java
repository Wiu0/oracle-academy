package desafio.facil;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Academia {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Bem vindo Academia GF");
		System.out.println("======================");
		
		System.out.println("Qual seu nome?");
		String aluno = sc.next();
		
		System.out.println("Qual seu ano de nascimento?");
		int anoNascimento = sc.nextInt();
		
		int anoMin = OffsetDateTime.now().getYear() - 18;
		if(anoNascimento < anoMin) {
			System.out.println(aluno + " cadastrada");	
		} else {
			System.out.println("Responsavel concorda?");
			String resposta = sc.next();
			if(resposta.equals("sim")) {
				System.out.println(aluno + " cadastrada");
			} else {
				System.out.println(aluno + " nao cadastrada");	
			}			
		}	
		sc.close();
	}
}




