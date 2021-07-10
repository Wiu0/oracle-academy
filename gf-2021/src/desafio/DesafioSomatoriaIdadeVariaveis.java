package desafio;

import calculadora.Calculadora;

public class DesafioSomatoriaIdadeVariaveis {

	public static void main(String[] args) {
		//Forma 1. Todas as variaveis do mesmo tipo na mesma linha
		byte idade1, idade2, idade3;
		//Forma 2. Cada  variavel em uma linha		
		byte idade4;
		byte idade5;

		idade1 = 30;
		idade2 = 29;
		idade3 = 7;
		
		byte idade6 = 45;
		
		Calculadora c = new Calculadora();
		//idade6 = 45; NAO É NECESSARIO MAIS
		
		double somatoria = c.somar(idade1, idade2);
		//System.out.println(idade1 + idade2 + idade3);
		System.out.println(somatoria);
	}
}
