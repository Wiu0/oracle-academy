package br.com.oracle.gf.desafio.heranca.constructor2.sobrescrita.sobrecarga;

public class Felino {

	
	//criar get e set do atributo peso
	private double peso;
	String som;
	
	//Construtor Felino. Informar o peso do felino
	public Felino(String som) {
		this.som = som;
	}
	
	
	public void emitirSom() {
		System.out.println("mmmmm");
	}

	

}
