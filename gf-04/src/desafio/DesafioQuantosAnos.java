package desafio;

import calculadora.Calculadora;

//TODO POO => Programacao Orientada a Objetos. Pilares da POO

public class DesafioQuantosAnos {

	public static void main(String[] args) {
		int anoNascimento = 1993;
		double idadeAtual = -1;
		Calculadora c = new Calculadora();

		//SE anoNascimento <= 2021
		if(anoNascimento <= 2021) {
			idadeAtual = c.subtrair(2021, anoNascimento);	
			System.out.println(idadeAtual);
		} else {
			System.out.println("Seu ano de nascimento é do futuro");
		}
//
//		//SE anoNascimento <= 2021
//		if(2021 <= anoNascimento) {
//			idadeAtual = 2021 - anoNascimento;	
//			System.out.println(idadeAtual);
//		} else {
//			System.out.println("Seu ano de nascimento é do futuro");
//		}
//
//		//SE anoNascimento <= 2021
//		if(anoNascimento > 2021) {
//			System.out.println("Seu ano de nascimento é do futuro");
//		} else {
//			idadeAtual = 2021 - anoNascimento;	
//			System.out.println(idadeAtual);
//		}

	}
}

