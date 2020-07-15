import java.util.Scanner;

public class MediaAlunoMelhoradaAritmetica {
	
	public static void main(String[] args) {

		//{William 5 7 8 9}enter
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual x nome dx alunx?");
		String nome = sc.nextLine();
		System.out.println("Qual a nota do primeiro bimestre?");
		double nota1 = sc.nextDouble();
		System.out.println("Qual a nota do segundo bimestre?");
		double nota2 = sc.nextDouble();
		System.out.println("Qual a nota do terceiro bimestre?");
		double nota3 = sc.nextDouble();
		System.out.println("Qual a nota do quarto bimestre?");
		double nota4 = sc.nextDouble();
		
		double resultado = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Nome dx alunx: " + nome);
		System.out.println("Média dx alunx é: " + resultado);
		
		//alunx aprovado ou nao?
		//se resultado maior que 5 entao
		//aprovado
		//senao
		//reprovado
		if(resultado < 5) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}

		sc.close();
		
		
		
	}
}
