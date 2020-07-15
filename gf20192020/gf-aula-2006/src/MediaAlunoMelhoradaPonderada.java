import java.util.Scanner;

public class MediaAlunoMelhoradaPonderada {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome dx alunx?");
		String nome = sc.next();
		
		System.out.println("Informe Peso 1");
		int peso1 = sc.nextInt();
		System.out.println("Informe Peso 2");
		int peso2 = sc.nextInt();
		System.out.println("Informe Peso 3");
		int peso3 = sc.nextInt();
		
		System.out.println("Informe nota 1");
		double nota1 = sc.nextDouble();
		System.out.println("Informe nota 2");
		double nota2 = sc.nextDouble();
		System.out.println("Informe nota 3");
		double nota3 = sc.nextDouble();
		
		double media = 0;
		
		
		media = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3)/(peso1 + peso2 + peso3);
		System.out.println("A media do " + nome + " é " + media);
		
		sc.close();
	}
}

////Sammara	
//n1 = 5  p1 = 2
//n2 = 7  p2 = 3
//n3 = 8  p3 = 5
////Joao
//n1 = 8
//n2 = 7
//n3 = 5
////Aritmetica
//Sammara -> (5 + 7 + 8)/3 = 6.66
//Joao    -> (8 + 7 + 5)/3 = 6.66
//
////Ponderada
//		formula -> (n1 * p1 + n2 * p2 + n3 * p3)/(p1 + p2 + p3)
//		Sammara -> (5 * 2 + 7 * 3 + 8 * 5)/(2 + 3 + 5) = 7.1
//		Joao    -> (8 * 2 + 7 * 3 + 5 * 5)/(2 + 3 + 5) = 5.5