import java.util.Scanner;

public class BryanDesafio {

	// prox desafio :
	// Escolher a quantidade de alunos
	// Nome para cada aluno
	// quantidade de bimestres
	// media de cada aluno
	// no final faz uma lista com cada aluno aprovado

	public static void main(String[] args) {
		System.out.println("Escolha uma opcao !");
		System.out.println("Opcao[1] Media Ponderada ");
		System.out.println("Opcao[2] Media Aritimetica");
		Scanner sc = new Scanner(System.in);
		int resposta = 1;

		int opcao = sc.nextInt();
		while (resposta == 1)

			switch (opcao) {
			case 1:
				System.out.println("Qual peso da primeira nota ?");
				int peso1 = sc.nextInt();
				System.out.println("Qual peso da segunda nota ?");
				int peso2 = sc.nextInt();
				System.out.println("Qual peso da terceira nota ?");
				int peso3 = sc.nextInt();
				System.out.println("Qual peso da quarta nota ?");
				int peso4 = sc.nextInt();

				System.out.println("Qual nome do aluno");
				// Scanner sc = new Scanner (System.in);
				String name = sc.next();
				System.out.println("Qual nota do Primeiro Bimestre");
				double nota1 = sc.nextDouble();
				System.out.println("Qual nota do segundo Bimestre");
				double nota2 = sc.nextDouble();
				System.out.println("Qual nota do Terceiro Bimestre");
				double nota3 = sc.nextDouble();
				System.out.println("Qual nota do Quarto Bimestre");
				double nota4 = sc.nextDouble();

				double resultado = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) / 10;
				System.out.println("Nome do aluno " + name);
				System.out.println("Media do aluno È " + resultado);

				if (resultado < 5) {
					System.out.println("Reprovado");
				} else {
					System.out.println("Aprovado");
					opcao++;
				}
				break;
			case 2:
				System.out.println("Qual nome do aluno");
				// Scanner sc = new Scanner (System.in);
				String name2 = sc.next();
				System.out.println("Qual nota do Primeiro Bimestre");
				double nota5 = sc.nextDouble();
				System.out.println("Qual nota do segundo Bimestre");
				double nota6 = sc.nextDouble();
				System.out.println("Qual nota do Terceiro Bimestre");
				double nota7 = sc.nextDouble();
				System.out.println("Qual nota do Quarto Bimestre");
				double nota8 = sc.nextDouble();

				double resultado2 = (nota5 + nota6 + nota6 + nota8) / 4;
				System.out.println("Nome do aluno " + name2);
				System.out.println("Media do aluno È " + resultado2);

				if (resultado2 < 5) {
					System.out.println("Reprovado");
				} else {
					System.out.println("Aprovado");
					opcao++;
				}
			}
		sc.close();
	}
}
