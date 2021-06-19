package desafio;

public class DesafioMediaIdade {

	public static void main(String[] args) {

		int idadePai = 30, idadeMae = 29, idadeCrianca = 7;
		int quantidadeIdades = 3;

//		System.out.println((idadePai + idadeMae + idadeCrianca)/quantidadeIdades);

		int somatoria = idadePai + idadeMae + idadeCrianca;
		int mediaIdadeCasa = somatoria/quantidadeIdades;

//		System.out.print("A idade media na casa que vc mora é ");
//		System.out.print(mediaIdadeCasa);
//		System.out.print(" anos");
		
		
		System.out.println("A idade media na casa que vc mora é " + mediaIdadeCasa + " anos");
		
//		System.out.println(10 + 23 + "12");
//		System.out.println("12" + 10 + 23);
//		System.out.println( 10 + "12" + 23);
//		System.out.println( "12" + (10 + 23));

	}
}

