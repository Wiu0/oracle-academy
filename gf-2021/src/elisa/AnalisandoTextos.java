package elisa;

import java.util.Scanner;

public class AnalisandoTextos {

	public static void main(String[] args) {

		pedirTextosUsuario();
	}

	static void pedirTextosUsuario(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a primeira palavra: ");
		String palavra = sc.next();
		System.out.println("Insira a segunda palavra: ");
		String palavra2 = sc.next();
		//rever
		palavra.toLowerCase();
		palavra2.toLowerCase();	
		sc.close();

		compararTamanhoTexto(palavra, palavra2);
		contarVogais(palavra, palavra2);
		contarConsoante(palavra, palavra2);


	}

	String maiorTexto(String textoUm, String textoDois) {
		int numPalavra = textoUm.length();
		int numPalavra2 = textoDois.length();

		if(numPalavra > numPalavra2) {
			return textoUm;
		}else {
			return textoDois;
		}
	}
	
	static void compararTamanhoTexto(String textoUm, String textoDois ) {
		int numPalavra = textoUm.length();
		int numPalavra2 = textoDois.length();

		if(numPalavra > numPalavra2) {
			System.out.println("A palavra " + textoUm + " � maior");
		}else {
			System.out.println("A palavra " + textoDois + " � maior");
		}

	}

	static void contarVogais(String textoUm, String textoDois) {

		int contarVogais = 0;
		int contarVogaisDois = 0;

		char vogais[]  = {'a', 'e', 'i', 'o', 'u'};



		for (int i = 0; i < textoUm.length(); i++){
			char c = textoUm.charAt(i);
			if (contem (vogais, c))
				contarVogais++;
		}

		for (int i = 0; i < textoDois.length(); i++){
			char c = textoDois.charAt(i);
			if (contem (vogais, c))
				contarVogaisDois++;
		}

		compararVogais(textoUm, textoDois, contarVogais, contarVogaisDois);
	} 

	static void compararVogais(String textoUm, String textoDois, int numVTUm, int numVTDois) {

		if (numVTUm > numVTDois) {
			System.out.println("A palavra " + textoUm + " tem mais vogais");	
		}else if (numVTUm == numVTDois){
			System.out.println("Os dois textos tem o mesmo numero de vogais");	
		}	else {
			System.out.println("A palavra " + textoDois + " tem mais vogais");		
		}
	} 

	static void contarConsoante(String textoUm, String textoDois) {
		int contarCon = 0;
		int contarConDois = 0;
		char con[]  = {'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v','w', 'x', 'y', 'z' };

		for (int i = 0; i < textoUm.length(); i++){
			char c = textoUm.charAt(i);
			if (contem (con, c))
				contarCon++;
		}

		for (int i = 0; i < textoDois.length(); i++){
			char c = textoDois.charAt(i);
			if (contem (con, c))
				contarConDois++;
		}

		compararConsoante(textoUm, textoDois, contarCon, contarConDois);
	}

	static void compararConsoante(String textoUm, String textoDois, int numVCUm, int numVCDois) {

		if (numVCUm > numVCDois) {
			System.out.println("A palavra " + textoUm + " tem mais consoantes");	
		}else if (numVCUm == numVCDois){
			System.out.println("Os dois textos tem o mesmo numero de consoantes");	
		}	else {
			System.out.println("A palavra " + textoDois + " tem mais consoantes");		
		}


	}	

	private static boolean contem (char vetor[], char comparacao){
		boolean flag = false;

		for (int i = 0; i < vetor.length; i++){
			if (vetor[i] == comparacao)
				flag = true;
		}

		return flag;

	}
}


/*
 Mouse
 	Atributos
 	 - cor
 	 - led
	Metodos
	 - clicar
	 - mover
	 - rolar
	 
================
 Livro
	Atributos
	 - nome
	 - quantidadePaginas
	 - autor
	 - tema
	 - desenhoCapa = "Dragao.png"   
	Metodos 
	 - folhear	
*/















