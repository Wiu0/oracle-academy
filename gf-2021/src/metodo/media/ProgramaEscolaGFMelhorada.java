package metodo.media;

import java.util.Scanner;

public class ProgramaEscolaGFMelhorada {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 1;
		while (opcao != 0) {
			System.out.println("1-Calcular, 2 - Valor para Nota3, 0 - sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				exemplo1ComCalculoDeMedia();
				break;
			case 2:
				exemplo2QuantoFaltaParaPassarDeAno();
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
				break;
			}
		}
	}

	static void exemplo2QuantoFaltaParaPassarDeAno() {

		Aluno aluno = new Aluno();

		System.out.println("Qual seu nome*?");
		aluno.nome = sc.next();
		System.out.println("Qual sua nota 1?");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Qual sua nota 2?");
		aluno.nota2 = sc.nextDouble();

		double valorMinimoNota3ParaPassarDeSerie = aluno.calcularQuantoPrecisaParaPassarDeAno();
		System.out.println(
				aluno.nome + ", vc precisa tirar " + valorMinimoNota3ParaPassarDeSerie + " para passar de serie");
	}

	static void exemplo1ComCalculoDeMedia() {

		Aluno aluno = new Aluno();

		System.out.println("Qual seu nome*?");
		aluno.nome = sc.next();
		System.out.println("Qual sua nota 1?");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Qual sua nota 2?");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Qual sua nota 3?");
		aluno.nota3 = sc.nextDouble();

		double mediaAluno = aluno.calcularMedia();
		System.out.println(aluno.nome + ", vc tirou " + mediaAluno);
	}

}
