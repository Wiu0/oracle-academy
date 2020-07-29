import java.util.Scanner;

public class MaiorMenorDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menor = 0, maior = 0;
		int n = 0;
		
//		do {
//			
//		}
		System.out.println("Digite um numero");
		menor = maior = sc.nextInt();
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite um numero");
			n = sc.nextInt();
			if(n > maior) {
				maior = n;
			}
			if(n < menor) {
				menor = n;
			}
		}
		System.out.println("Maior " + maior + " \nMenor " + menor);
		sc.close();
	}
}
