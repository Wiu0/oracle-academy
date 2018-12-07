package br.com.oracle.lesson3.escopo;

/**
 * Escopo dentro do metodo � determinado  pela abertura e fechamento de chaves
 * @author wiu
 */
public class EscopoVariavel {

	public static void main(String[] args) {
		//Variavel valor deve ser unica dentro desse metodo
		
		int valor = 0;
		System.out.println("Imprimindo valor: " + valor);
		
		//for gera erro pois variavel valor j� est� declarada
		//for(int valor = 1; valor < 10; valor++); 
		
		{
			//Aqui d� erro tambem, pois esse escopo est� dentro do metodo main
			//int valor = 1;
		}
		
		{
			int valor1 = 0;
			System.out.println("Valor1 dentro do Escopo " + valor1);
		}
		//Erro aqui acontece, pois variavel valor1 foi crianda em um escopo especifico e o metodo main nao tem acesso a ela
		//System.out.println("Valor1 fora do Escopo " + valor1);
	}
}
