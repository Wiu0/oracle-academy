package br.com.oracle.gf.desafio;

import java.util.Scanner;

//Mostrar pro usuario generos de filme/musica já no sistema
//Informar para o usuario como funciona a forma de classificacao ex:
//1 a 5, 1 - 10, 1 - 100, etc

//Mostrar todos filme/musica do genero que a pessoa escolheu 
//Mostrar o filme/musica
//Pedir a classificacao daquele filme/musica

// apresentar a media aritmetica dos filmes e os nomes dos filmes. Ex:
//Os filmes: AAAAA, BBBBB e CCCCC tem uma media de x

public class DesafioN3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcaoGeneroFilme;
		double somatoriaNota = 0;
		double media;

		System.out.println("Escolha um dos generos de filme a seguir: \n\t0 - Desenho \n\t1 - Acao \n\t2 - Terror");
		opcaoGeneroFilme = Integer.parseInt(sc.nextLine());

		System.out.println("Ao classificar os filmes, por favor informar um número inteiro entre 1 e 5");
		
		if (opcaoGeneroFilme == 0) {
			System.out.println("Os filmes disponiveis para avaliacao sao: \n\t0 - Carros \n\t1 - Naruto \n\t2 - Yu-gi-oh");
			for(int i = 0; i < 3; i++) {
				System.out.println("Informe a nota do filme " + i);
				somatoriaNota += Integer.parseInt(sc.nextLine());
			}
		} else if (opcaoGeneroFilme == 1) {
			System.out.println("Os filmes disponiveis para avaliacao sao: \n\t0 - Matrix \n\t1 - VV \n\t2 - Batman vs Superman");
			for(int i = 0; i < 3; i++) {
				System.out.println("Informe a nota do filme " + i);
				somatoriaNota += Integer.parseInt(sc.nextLine());
			}
		} else if (opcaoGeneroFilme == 2) {
			System.out.println("Os filmes disponiveis para avaliacao sao: \n\t0 - Bruxa de blair \n\t1 - O Exorcista \n\t2 - Atividade Paranormal");
			for(int i = 0; i < 3; i++) {
				System.out.println("Informe a nota do filme " + i);
				somatoriaNota += Integer.parseInt(sc.nextLine());
			}
		} else {
			System.out.println("Opcao nao existente");
		}
		
		media = somatoriaNota/3;
		System.out.println(media);
		sc.close();
	}
}
