
public class IMC {
	
	public static void main(String[] args) {
		double massa = 76;
		double altura = 1.86;
		
		double imc;
		imc = massa/(altura * altura);
		System.out.println("O seu IMC é " + imc + ".");
		
		if(imc < 18.5) {
			System.out.println("Seu indice é: Magreza");
		}
		
		if(imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu indice é: Normal");
		}
		
		if(imc >= 24.9 && imc < 30) {
			System.out.println("Seu indice é: Sobrepeso");
		}
		
		if(imc > 30) {
			System.out.println("Seu indice é: Obesidade");
		}
		//SE, if
		
		//se imc < 18.5  				:Magreza
		//se imc >= 18.5 imc < 24.9		:Normal
		//se imc >= 24.9 imc < 30		:Sobrepeso
		//se imc >= 30					:Obesidade
		
		
		
		
		
	}

}
