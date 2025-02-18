package br.com.oracle.lesson2.construtor;

/**
 * Construtor de um objeto � utilizado para que a JVM gere na memoria do computador uma instancia do objeto que ser� manipulado.
 * Por padr�o, toda classe chama tem um construtor padrao e o dev nao � obrigado a cria-la
 * @author wiu
 */
public class ConstrutorAvancado {

	String value;
	/**
	 * Devemos usar o construtor com parametros quando queremos for�ar o dev a passar para o objeto no minimo um valor inicial para o objeto ser
	 * criado.
	 * Quando criamos um construtor com parametros, o construtor "default", aquele que nao precisa ser digitado, fica indisponivel. Sendo assim
	 * necessario o construtor default ser adicionado novamente pelo dev caso ele queira
	 */
	public ConstrutorAvancado(String value) {
		System.out.println("Aqui o Java est� instanciando esse objeto na memoria");
		this.value = value;
	}
	
	/*
	 * Aqui est� sendo feito uma sobrecarga para o construtor que aceita um parametro do tipo String
	 */
	public ConstrutorAvancado() {
		this("");
	}
	
	/*
	 * Validando se ser� impresso o texto: "Aqui o Java est� instanciando esse objeto na memoria" que est� no construtor do objeto
	 */
	public static void main(String[] args) {
		new ConstrutorAvancado("Wiu");
		new ConstrutorAvancado();
	}
	
}
