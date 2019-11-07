package br.com.kroton.variavel.numerica.conversao;

public class Conversao {

	public static void main(String[] args) {
		String idade = "24";
		byte valorIdade = Byte.parseByte(idade);
		System.out.println(valorIdade);
		
//		valorIdade = Byte.parseByte("130"); Erro fora do range
//		valorIdade = Byte.parseByte("x");   Erro nao é numero 
//		System.out.println(valorIdade);
	}

}
