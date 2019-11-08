package br.com.kroton.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculadoraTeste {

	static double calcular() throws NegativoException, MaiorQue10Exception {
		Calculadora calc = new Calculadora();
		return calc.multiplicar(3, 3);
	}

	public static void main(String[] args) throws NegativoException, MaiorQue10Exception {
		Calculadora calc = new Calculadora();
		double resultado = calc.somar(3, 5, 1);
		System.out.println(resultado);

		resultado = calc.somar(3, 5);
		System.out.println(resultado);

		resultado = calcular();
		System.out.println(resultado);
		
		double valores[] = {12, 32, 45, 69, 88};
		System.out.println(calc.somar(valores));
		
		double valor[] = new double[50];
		valor[0] = 12;
		valor[1] = 13;
		valor[2] = 5;
		valor[3] = 100;
		System.out.println(calc.somar(valor));
		
		double[] val = {235,35,688}, val4 = {1,2}, val5 = {3};
		double val1[] = {1,2}, val2 = 1, val3 = 3;
				
		
		List<Double> lista = new ArrayList<Double>();
		lista.add(12d);
		lista.add(120d);
		lista.add(1d);
		lista.add(52d);
		lista.add(689d);
		
		System.out.println(calc.somar(lista));
		
		

		
	}
}









