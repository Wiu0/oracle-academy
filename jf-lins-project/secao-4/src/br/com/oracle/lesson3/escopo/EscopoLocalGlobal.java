package br.com.oracle.lesson3.escopo;

public class EscopoLocalGlobal {

	/*Essa variavel � chamada de variavel de escopo global, pois a mesma pertence ao objeto EscopoLocalGlobal, sendo acessivel a qualquer metodo
	* do objeto.
	*/
	int valor1 = 0;
	
	private void testar() {
		/*Essa variavel � chamada de variavel de escopo local, pois a mesma pertence apenas ao metodo testar
		*/
		int valor1 = 1;
		
		System.out.println("Mostrando variavel local: " + valor1);

		System.out.println("Mostrando variavel global(Usar palavra \"this\"): " + this.valor1);
			
	}
	
	public static void main(String[] args) {
		new EscopoLocalGlobal().testar();
	}
	
}
