package br.com.kroton.calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	//	public double multiplicar(double n1, double n2) {
	//		if(n1 < 0 || n2 < 0 ) {
	//			return -1;
	//		}
	//		if(n1 > 10 || n2 > 10) {
	//			return -2;
	//		}
	//		return n1 * n2;
	//	}
	public double multiplicar(double n1, double n2) throws  NegativoException,MaiorQue10Exception {
		if(n1 < 0 || n2 < 0 ) {
			throw new NegativoException();
		}
		if(n1 > 10 || n2 > 10) {
			throw new MaiorQue10Exception();
		}
		return n1 * n2;
	}


	//	public double somar(double n[]) {
	//		double resultado = 0;
	//		int i = 0;
	//		do {
	//			resultado += n[i];
	//			i++;
	//		} while(i < n.length);
	//		return resultado;
	//	}

	//	public double somar(double n[]) {
	//		double resultado = 0;
	//		int i = 0;
	//		while(i < n.length) {
	//			resultado += n[i];
	//			i++;
	//		}
	//		return resultado;
	//	}

	public double somar(List<Double> n) {
		double resultado = 0;
		for(int i = 0; i < n.size();i++) {
			resultado += n.get(i);
		}
		return resultado;
	}

	public double somar(double n[]) {
		double resultado = 0;
		for(int i = 0; i < n.length;i++) {
			resultado += n[i];
		}
		return resultado;
	}

	//	public double somar(double n[]) {
	//		double resultado = 0;
	//		int i = 0;
	//		for(;;) {
	//			resultado += n[i];
	//			i++;
	//			if(i < n.length) break;
	//		}
	//		return resultado;
	//	}

	public double somar(double n1, double n2) {
		return n1 + n2;
	}
	public double somar(double n1, double n2, double n3) {
		return somar(somar(n1, n2) , n3);
	}
}
