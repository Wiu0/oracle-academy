package br.com.oracle.lesson2.gas;

/**
 * Toda classe java extends da classe Object e uma dos metodos existentes é o toString(), iremos sobreescreve-lo
 * @author wiu
 *
 */
public class ToString {
	
	int value;

	//@ é usado quando estamos utilizando annotations,override indica que estamos sobrescrevendo um metodo da classe mae
	@Override
	public String toString() {
		//Descomentar return da linha 16 e comentar da linha 17, depois fazer o inverso. Qual a diferenca?
		//return super.toString();
		return value + "";
	}
}
