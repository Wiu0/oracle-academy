package br.com.oracle.lesson2.construtor;

/**
 * Construtor de um objeto é utilizado para que a JVM gere na memoria do computador uma instancia do objeto que será manipulado.
 * Por padrão, toda classe chama tem um construtor padrao e o dev nao é obrigado a cria-la
 * @author wiu
 */
public class ConstrutorIntermediario {

	String value;
	/**
	 * Devemos usar o construtor com parametros quando queremos forçar o dev a passar para o objeto no minimo um valor inicial para o objeto ser
	 * criado.
	 * Quando criamos um construtor com parametros, o construtor "default", aquele que nao precisa ser digitado, fica indisponivel. Sendo assim
	 * necessario o construtor default ser adicionado novamente pelo dev caso ele queira
	 */
	public ConstrutorIntermediario(String value) {
		System.out.println("Aqui o Java está instanciando esse objeto na memoria");
		this.value = value;
	}
	
	/*
	 * Validando se será impresso o texto: "Aqui o Java está instanciando esse objeto na memoria" que está no construtor do objeto
	 */
	public static void main(String[] args) {
		new ConstrutorIntermediario("Wiu");
		//O Construtor sem parametro nao funciona, caso queira testar, remova o comentario
		//new ConstrutorIntermediario();
	}
	
}
