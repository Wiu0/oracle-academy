
package calculadora;

public class CalculadoraNotSoOld {

	//Operacoes matematicas
	//dois numeros
	public static void main(String[] args) {
	
		double numero1 = 50.7, numero2 = 19.9;
		double resultado;
		
		resultado = somar(numero1, numero2);
		System.out.println(resultado);
		
		resultado = subtrair(numero1, numero2);
		System.out.println(resultado);
		
		resultado = multiplicar(numero1, numero2);
		System.out.println(resultado);
		
		resultado = dividir(numero1, numero2);
		System.out.println(resultado);
	}	
	
	static double somar(double numero1, double numero2) {
		double resultado;	
		resultado = numero1 + numero2;
		return resultado;
	}
	
	static double subtrair(double numero1, double numero2) {
		double resultado;	
		resultado = numero1 - numero2;
		return resultado;
	}
	
	static double multiplicar(double numero1, double numero2) {
		double resultado;	
		resultado = numero1 * numero2;
		return resultado;
	}
	
	
	static double dividir(double numero1, double numero2) {
		double resultado;	
		resultado = numero1/numero2;
		return resultado;
	}

}
