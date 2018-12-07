package br.com.oracle.lesson3.tipo.variavel.casting;

public class Casting {

	public static void main(String[] args) {
		
		//byte valorByte = 324;
		byte valorByte = (byte)324;
		System.out.println("Valor inicial era 324, valor após cast para byte: " + valorByte);
		
		int valorInt = 34;
		valorByte = (byte) valorInt;
		System.out.println("Valor inicial 34, mas por ser int, teve-se usar cast para deixar byte: " + valorByte);
		
	}
}
