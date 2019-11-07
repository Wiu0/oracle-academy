package br.com.kroton.variavel.numerica.conversao;

public class Cast {

	public static void main(String[] args) {
		byte valor = (byte)130;
		System.out.println(valor);
		/*-128, -127, -126 ... 1, 2, 3 ... 127
		
		(byte)128 => 128 - 127 = 1 posicao = -128
		(byte)130 => 130 - 127 = 3 posicao = -126
		*/
		int valorMaior = valor;
		System.out.println(valorMaior);

		//Decimal para inteiro
		double valorPi = 3.14;
		int   novoValorPi = 0;
		
		novoValorPi = (int)valorPi;
		System.out.println(novoValorPi);
		
		float novaValorPiDecimal =	(int)valorPi;
		System.out.println(novaValorPiDecimal);
		
				
	}

}
