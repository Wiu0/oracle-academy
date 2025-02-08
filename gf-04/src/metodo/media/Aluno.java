package metodo.media;

public class Aluno {
	
	double mediaMinima = 5;
	
	String nome;
	double nota1, nota2, nota3;
	
	public double calcularMedia() {
		double resultado = (nota1 + nota2 + nota3)/3;
		return resultado;
	}	
	
	//Calcular o valor da nota3 para que o aluno
	//consiga passar de serie. Media minima é 5
	//Exemplo. nota1 = 10 e nota2 = 1. Nota3 = ?
	// (10 + 1 + 1)/3 = 4
	// (10 + 1 + 2)/3 = 4.2
	// (10 + 1 + 4)/3 = 5
	// Nova Logica
	// 15 - nota1 + nota2
	public double calcularQuantoPrecisaParaPassarDeAno() {
		return 15 - (nota1 + nota2);
	}
}

/*
Qual o objeto?
Aluno
	Atributos?
	    nome
	    serie
	    idade
	    sexo
	    altura
		nota1, nota2, nota3
	Metodos?
		calcularMedia
		calcularQuantoPrecisaParaPassarDeAno
		somar***
		pedirNota
	 
================

*/

