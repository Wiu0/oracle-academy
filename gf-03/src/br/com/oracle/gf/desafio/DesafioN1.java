package br.com.oracle.gf.desafio;

import java.util.Scanner;

//Pedir pro usuario informar um genero de filme/musica
//Informar para o usuario como funciona a forma de classificacao ex:
//1 a 5, 1 - 10, 1 - 100, etc
//Pedir o nome de tres filmes e a nota/avaliacao para o usuario
// apresentar a media aritmetica dos filmes e os nomes dos filmes. Ex:
//Os filmes: AAAAA, BBBBB e CCCCC tem uma media de x
public class DesafioN1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String generoFilme;
		String nomeFilme1, nomeFilme2, nomeFilme3;
		int avaliacaoFilme1, avaliacaoFilme2, avaliacaoFilme3;
		double media;
		
		System.out.println("Por favor informe um genero de filme");
		generoFilme = sc.nextLine();
		
		System.out.println("Ao classificar os filmes, por favor informar um número inteiro entre 1 e 5");
		
		System.out.println("Informe o nome do filme 1");
		nomeFilme1 = sc.nextLine();
		System.out.println("Informe a nota do filme 1");
		avaliacaoFilme1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o nome do filme 2");
		nomeFilme2 = sc.nextLine();
		System.out.println("Informe a nota do filme 2");
		avaliacaoFilme2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o nome do filme 3");
		nomeFilme3 = sc.nextLine();
		System.out.println("Informe a nota do filme 3");
		avaliacaoFilme3 = Integer.parseInt(sc.nextLine());
		
		media = (avaliacaoFilme1 + avaliacaoFilme2 + avaliacaoFilme3)/3.;
		
		System.out.println("Os filmes do genero " + generoFilme + " : " + nomeFilme1 + ", " +  nomeFilme2 + " e " + nomeFilme3 +  " tem uma media de " + media);
		
		sc.close();
	}
	
}
