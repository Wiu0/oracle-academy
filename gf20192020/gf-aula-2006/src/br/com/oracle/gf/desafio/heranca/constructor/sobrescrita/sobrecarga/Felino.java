package br.com.oracle.gf.desafio.heranca.constructor.sobrescrita.sobrecarga;

public class Felino {

	//criar get e set do atributo peso
	private double peso;

	//Construtor Felino. Informar o peso do felino
	public Felino(double peso) {
		this.peso = peso;
	}
	
	public void emitirSom() {
		System.out.println("mmmmm");
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
