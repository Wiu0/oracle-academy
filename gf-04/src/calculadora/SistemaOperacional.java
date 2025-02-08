package calculadora;

import javax.swing.JOptionPane;

public class SistemaOperacional {

	
	public static void main(String[] args) {
//		CalculadoraOld calculadora = new CalculadoraOld();
//		
//		calculadora.main(null);
		
		CalculadoraNotSoOld calculadora = new CalculadoraNotSoOld();
		
		
		double resultado = calculadora.multiplicar(30, 2);
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
