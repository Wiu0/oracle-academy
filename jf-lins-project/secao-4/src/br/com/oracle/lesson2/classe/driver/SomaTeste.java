package br.com.oracle.lesson2.classe.driver;

import java.util.Scanner;

import br.com.oracle.lesson2.classe.objeto.Soma;

/**
 * Classe Driver. Responsabilidade da classe � invocar a classe de objeto "Soma"
 * � Inst�ncias de objetos de uma classe de objeto
 * � Vari�veis
 * � Loops, instru��es condicionais (if-else)
 * � Outra l�gica de programa��o
 * � Tamb�m pode conter outros m�todos est�ticos
 *@author wiu
 *@since 20181206
 * */
public class SomaTeste {

	/*
	 * metodo main est� acionando um loop para ficar pedindo entrada de dados para o usuario. E sempre utiliza a classe Soma(Classe de Objeto), para
	 * calcular a soma.
	 * Utilizado conceito de Escape para imprimir "(aspas) no dentro da pr�pria String
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Entre com o numero 1 e depois numero 2. Dar \"Enter\" para passar o numero 2");
			mostrarCalculo(sc.nextDouble(), sc.nextDouble());
			System.out.println("Para finalizar o programa, digite \"SAIR\"");
		}while(!sc.next().toUpperCase().equals("SAIR"));
		sc.close();
		System.out.println("Finalizando programa");
	}

	private static void mostrarCalculo(double n1, double n2) {
		Soma s = new Soma();
		System.out.println(s.calcular(n1, n2));
	}
}
