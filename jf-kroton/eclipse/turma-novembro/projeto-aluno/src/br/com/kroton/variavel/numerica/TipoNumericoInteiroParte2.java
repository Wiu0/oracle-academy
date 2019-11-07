package br.com.kroton.variavel.numerica;

public class TipoNumericoInteiroParte2 {
	
	public static void main(String[] args) {
		byte varByteMax = Byte.MAX_VALUE;
		byte varByteMin = Byte.MIN_VALUE;
		short varShortMax = Short.MAX_VALUE;
		short varShortMin = Short.MIN_VALUE;
		int varIntMax = Integer.MAX_VALUE;
		int varIntMin = Integer.MIN_VALUE;
		long varLongMax = Long.MAX_VALUE;
		long varLongMin = Long.MIN_VALUE;
		print("Byte", varByteMin, varByteMax);
		print("Short", varShortMin, varShortMax);
		print("Integer", varIntMin, varIntMax);
		print("Long", varLongMin, varLongMax);
	}
	
	static void print(String tipo, long min, long max) {
		System.out.println(
				"Tipo: " + tipo + " MIN: " + min + " MAX: " + max);
	}
	
	
}
