package imc;

public class IMC3 {

	public static void main(String[] args) {
		double massa = 176;
		double altura = 1.86;

		double imc;
		imc = massa / (altura * altura);
		System.out.println("O seu IMC é " + imc + ".");

		if (imc < 18.5) {
			System.out.println("Seu indice é: Magreza");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu indice é: Normal");
		} else if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu indice é: Sobrepeso");
		} else {
			System.out.println("Seu indice é: Obesidade");
		}
	}
}
