package imc;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double massa = sc.nextDouble();
		double altura = sc.nextDouble();
		sc.close();

		double imc;
		imc = massa / (altura * altura);
		System.out.println("O seu IMC é " + imc + ".");

		if (imc < 18.5) {
		    System.out.println("Abaixo do peso"); 
		}
		if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Bem");
		}

	}

}
