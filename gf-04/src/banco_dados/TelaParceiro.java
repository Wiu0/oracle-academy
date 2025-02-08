package banco_dados;

import java.util.Scanner;

public class TelaParceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Parceiro p = new Parceiro();
		
		System.out.println("Cadastrar Parceiro. Qual seu nome?");
		p.nome = sc.nextLine();
		
		System.out.println(p.nome + " Cadastrado com sucesso");
				
		sc.close();
	}
}
