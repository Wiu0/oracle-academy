import java.util.Scanner;

public class MetodoPessoaTrabalho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite seu salário: ");
		double salario = scanner.nextDouble();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
	}
}
