package br.com.oracle.lesson2.construtor;

/**
 * Construtor de um objeto � utilizado para que a JVM gere na memoria do computador uma instancia do objeto que ser� manipulado.
 * Por padr�o, toda classe chama tem um construtor padrao e o dev nao � obrigado a cria-la
 * @author wiu
 */
public class ConstrutorSimples {

	String value;
	/**
	 * Devemos usar o construtor para iniciar valores no objeto, exemplo: Iniciar a variavel value com 0
	 */
	public ConstrutorSimples() {
		System.out.println("Aqui o Java est� instanciando esse objeto na memoria");
		value = "0";
	}
	
	/*
	 * Validando se ser� impresso o texto: "Aqui o Java est� instanciando esse objeto na memoria" que est� no construtor do objeto
	 */
	public static void main(String[] args) {
		new ConstrutorSimples();
	}
	
}
