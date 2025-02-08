import java.util.Scanner;

public class IMCUltima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
		double peso = sc.nextDouble();
		double imc = peso / (altura * altura);
		sc.close();

		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);
		
		if (imc < 18.5) {
			System.out.println("abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("NORMMALLLL");
		} else if (imc > 24.9 && imc < 30) {
			System.out.println("Excesso de peso");
		} else {
			System.out.println("Obeso");
		}
	}
}
