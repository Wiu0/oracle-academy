package imc;

import javax.swing.JOptionPane;

/*
 * IMC é a sigla para Índice de Massa Corporal,que é um cálculo que serve para avaliar se a 
 * pessoa está dentro do seu peso ideal em relação à altura. 
 * Assim, de acordo com o valor do resultado de IMC, a pessoa pode saber se está dentro do peso ideal, 
 * acima ou abaixo do peso desejado.
 * Estar dentro do peso certo é importante porque estar acima ou abaixo desse peso pode 
 * influenciar bastante a saúde, aumentando o risco de doenças como desnutrição quando se está abaixo do peso, 
 * e AVC ou infarto, quando se está acima do peso. 
 * Assim, é comum os médicos, enfermeiros e nutricionistas avaliem o IMC da pessoa nas consultas de rotina 
 * para verificar a possibilidade de doenças que a pessoa pode estar pre-disposta.
 *
 * IMC	PESO
 * Magreza	    < 18.5	
 * Normal	    18.5 a 24.9	
 * Sobrepeso	24.9 a 30
 * Obesidade	> 30
 */
public class CalcularIMCMetodos {
	
	
	public static void main(String[] args) {
		
		double p = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso"));
		double a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o altura"));
		
		calcularIMC(p, a);
		
		p = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso"));
		a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o altura"));
		calcularIMC(p, a);
		
		p = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso"));
		a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o altura"));
		calcularIMC(p, a);
	}
	
	static void calcularIMC(double peso, double altura) {
		double i = peso/(altura * altura);	
		JOptionPane.showMessageDialog(null, "IMC: " + i);
	}

}
