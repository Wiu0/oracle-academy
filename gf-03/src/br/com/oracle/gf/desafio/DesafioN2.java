package br.com.oracle.gf.desafio;

import java.util.Scanner;

//Pedir pro usuario informar um genero de filme/musica
//Informar para o usuario como funciona a forma de classificacao ex:
//1 a 5, 1 - 10, 1 - 100, etc
//Pedir a quantidade de filmes que a pessoa quer avaliar
//Pedir o nome de cada filmes e a nota/avaliacao para o usuario
// apresentar a media aritmetica dos filmes e os nomes dos filmes. Ex:
//Os filmes: AAAAA, BBBBB e CCCCC tem uma media de x
public class DesafioN2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String generoFilme;
		int quantidadeFilmes;
		double somatoriaNota = 0;
		double media;
		String listaNomesFilme = "";
		
		System.out.println("Por favor informe um genero de filme");
		generoFilme = sc.nextLine();
		
		System.out.println("Por favor informe a quantidade de filmes que deseja avaliar");
		quantidadeFilmes = Integer.parseInt(sc.nextLine());
		
		System.out.println("Ao classificar os filmes, por favor informar um número inteiro entre 1 e 5");
		
		for(int i = 1; i <= quantidadeFilmes; i++) {
			System.out.println("Informe o nome do filme " + i);
			listaNomesFilme += sc.nextLine() + ",";
			System.out.println("Informe a nota do filme " + i);
			somatoriaNota += Integer.parseInt(sc.nextLine());
		}
		
		media = somatoriaNota/quantidadeFilmes;
		
		System.out.println("Os filmes do genero " + generoFilme + " : " + listaNomesFilme + " tem uma media de " + media);
		
		sc.close();
	}
}
