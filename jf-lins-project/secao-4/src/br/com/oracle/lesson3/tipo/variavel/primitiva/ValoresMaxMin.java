package br.com.oracle.lesson3.tipo.variavel.primitiva;

/**
 * Classe para demonstrar os tipos de variaveis que o Java possui e seus limites
 * @author wiu
 * @since 20181207
 */
public class ValoresMaxMin {

	/*
	 * Para mais detalhes pesquisar tabelas de range sobre variaveis java
	 */
	public static void main(String[] args) {

		//Variaveis boleana
		boolean ehSegundaFeira = false;
		System.out.println("Variavel boolean armazena \"true\" ou \"false\". Exemplo: � segunda feira: " + ehSegundaFeira);
		//Variaveis inteiras
		byte valorMinByte = Byte.MIN_VALUE;
		byte valorMaxByte = Byte.MAX_VALUE;
		System.out.println("Valor min byte: " + valorMinByte + " Valor max byte: " + valorMaxByte);
		
		short valorMinShort = Short.MIN_VALUE;
		short valorMaxShort = Short.MAX_VALUE;
		System.out.println("Valor min short: " + valorMinShort + " Valor max short: " + valorMaxShort);
		
		int valorMinInt = Integer.MIN_VALUE;
		int valorMaxInt = Integer.MAX_VALUE;
		System.out.println("Valor min int: " + valorMinInt + " Valor max int: " + valorMaxInt);
		
		long valorMinLong = Long.MIN_VALUE;
		long valorMaxLong = Long.MAX_VALUE;
		System.out.println("Valor min long: " + valorMinLong + " Valor max Long: " + valorMaxLong);
	
		//Variaveis de ponto flutuante
		float valorMinFloat = Float.MIN_VALUE;
		float valorMaxFloat = Float.MAX_VALUE;
		System.out.println("Valor min float: " + valorMinFloat + " Valor max float: " + valorMaxFloat);
		
		double valorMinDouble = Double.MIN_VALUE;
		double valorMaxDouble = Double.MAX_VALUE;
		System.out.println("Valor min double: " + valorMinDouble + " Valor max double: " + valorMaxDouble);
		
		//variaveis para armazenar caracteres alpha numerico
		char simbolo = '#';
		System.out.println("Char armazena apenas um caracter. Exemplo " + simbolo);
		
		long valorBits =  0b11010010_01101001_10010100_10010010;
		System.out.println("Variavel long recebeu em bits o valor a ser armazenado. Ex.: " + valorBits);
		long valorHex = 0x7fff_fff_fff_fffL;
		System.out.println("Variavel long recebeu em hex o valor a ser armazenado. Ex.: " + valorHex);

	}
}
