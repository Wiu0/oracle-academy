package desafio;

import java.util.Scanner;

public class DesafioMediaIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int idadePai = sc.nextInt(), idadeMae = sc.nextInt(), idadeCrianca = sc.nextInt();
		int quantidadeIdades = sc.nextInt();
		sc.close();
		
		
		
		int somatoria = idadePai + idadeMae + idadeCrianca;
		int mediaIdadeCasa = somatoria/quantidadeIdades;
	
		System.out.println("A idade media na casa que vc mora é " + mediaIdadeCasa + " anos");
		
	}
}

