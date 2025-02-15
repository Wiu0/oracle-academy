import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double peso = sc.nextDouble();
		double altura = sc.nextDouble();
		sc.close();
		double imc = peso / (altura * altura);
		System.out.println("Peso:" + peso);
		System.out.println("Altura:" + altura);
		System.out.println("IMC:" + imc);
		if (imc < 16.9) {
			System.out.println("Muito abaixo do peso");
		} else if (imc >= 16.9 && imc < 18.4) {
			System.out.println("abaixo do peso");
		} else if (imc >= 18.4 && imc < 24.9) {
			System.out.println("NORMALLL");
		} else if (imc >= 24.9 && imc < 29.9) {
			System.out.println("Acima peso");
		} else {
			System.out.println("obeso");
		}
	}
}
