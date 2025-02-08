import java.util.Scanner;

public class JuniorDesafio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("quantos alunos?");
		int num = scan.nextInt();
		System.out.println("quantos bimestre?");
		int totalBimestre = scan.nextInt();
		System.out.println("nota de corte?");
		double notaDeCorte = scan.nextDouble();

		String[] alunos = new String[num];
		double[][] notas = new double[num][totalBimestre];
		double[] mediaAlunos = new double[num];

		// coleta de nome
		for (int a = 0; a < num; a++) {
			System.out.println("insira o nome do " + (1 + a) + "° aluno");
			alunos[a] = scan.nextLine();
		}
		
		// coleta de notas
		for (int a = 0; a < num; a++) {

			for (int b = 0; b < totalBimestre; b++) {
				System.out.println("Insira a nota do aluno " + alunos[a] + " para o " + (b + 1) + "° Bimestre");
				notas[a][b] = scan.nextDouble();

			}
		}

		// media
		for (int a = 0; a < num; a++) {

			for (int b = 0; b < totalBimestre; b++) {
				mediaAlunos[a] += notas[a][b];

			}
			mediaAlunos[a] /= totalBimestre;

		}
		//
		System.out.println("===============RESULTADO==============");

		for (int a = 0; a < num; a++) {

			if (mediaAlunos[a] >= notaDeCorte) {
				System.out.println("Nome: " + alunos[a] + " Média:" + mediaAlunos[a] + " Situação: APROVADO!!!");

			}
			if (mediaAlunos[a] < notaDeCorte) {
				System.out.println("Nome: " + alunos[a] + " Média:" + mediaAlunos[a] + " Situação: REPROVADO!!!");

			}
			scan.close();
		}

	}

}