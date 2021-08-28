package converter;

import java.text.DecimalFormat;

public class NumeroTexto {
	
	public static void main(String[] args) {
	
		double idadeNumerica = 1328.728378127387128;
		
		String idadeTexto = idadeNumerica + "";
		System.out.println(idadeTexto);

		String novoNumero = String.valueOf(idadeNumerica);
		System.out.println(novoNumero);
		
		DecimalFormat d = new DecimalFormat("#,000.00");
		String numeroFormatado = d.format(idadeNumerica);
		System.out.println(numeroFormatado);
		
	}

}
