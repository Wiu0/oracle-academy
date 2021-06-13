import java.util.Scanner;

public class EntradaDadosUsuario {

	//5, 6, 10
	//6, 1, 8

	public static void main(String[] args) {
		//Greenfoot.ask("Qual seu nickname?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int minhaIdade = sc.nextInt();
		System.out.println("A idade digitada foi: " + minhaIdade);

		System.out.println("ano de nascimento");
		int ano = sc.nextInt();
		System.out.println("O ano digitada foi: " + ano);

		sc.close();
		
		int k = (1 * 2 + 3 * 4)/(5 + 6);
	}
}
//in = input
//out = output