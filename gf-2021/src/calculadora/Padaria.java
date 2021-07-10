package calculadora;

public class Padaria {

	public static void main(String[] args) {
//		CalculadoraOld calc = new CalculadoraOld();
//		CalculadoraNotSoOld calculadora = new CalculadoraNotSoOld();
//		double resultado = calculadora.somar(30, 2);
//		System.out.println(resultado);
		
		
		Calculadora c = new Calculadora();
		
		double r = c.subtrair(120, 1);
		System.out.println(r);
		
		
		r = c.multiplicar(20, 12);
		System.out.println(r);
	
		
		r = c.dividir(20, 2);
		System.out.println(r);
		
		
		r = c.somar(20, 12);
		System.out.println(r);
		
		
	}
}
