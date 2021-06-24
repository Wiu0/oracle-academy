package imc;


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
public class CalcularIMCMain {
	
	public static void main(String[] args) {
		//peso/altura x altura
		
		
		double peso = 85;
		double altura = 1.87;
		
		double imc = peso/(altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		if(imc < 18.5) {
			System.out.println("Seu IMC mostrou o nível Magreza: Valor " + imc);
		} else if(imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu IMC mostrou o nível Normal: Valor " + imc);
		}
		
		
	}

}
