package br.com.oracle.lesson2.api;

import java.io.File;

/**
 * Utilizando a classe Math para mostrar API de auxilio.
 * Utilizando a classe File para mostrar API que necessita de import. Classes que se localiza��o em outro pacote devem ser importadas. 
 * (Apenas o pacote java.lang que nao � necessario fazer import explicito)
 * @author wiu
 *
 */
public class APIExemplo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println("Verificar linha 3 no c�digo, l� est� sendo importada a classe File " + new File(""));
	}
}
