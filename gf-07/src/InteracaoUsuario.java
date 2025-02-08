import java.util.Scanner;

public class InteracaoUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte idade = sc.nextByte();
		int anoNascimento = 2024 - idade;
		System.out.println("A idade digitada foi: " + idade);
		System.out.println("O ano nasceu provalvemente é: " + anoNascimento);
	}
}
