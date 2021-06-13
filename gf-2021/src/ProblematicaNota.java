import java.util.Scanner;

public class ProblematicaNota {

	//Calcular e mostrar media Aritmetica de um aluno
	//Mostrar quais as notas que o aluno tirou
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas?");
		int qtdNotas = sc.nextInt();
		
		double notas[] = new double[qtdNotas];
		double somatoriaNotas = 0;
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("Informe a nota " + (i + 1));
			notas[i] = sc.nextDouble();
		}

		for(int i = 0; i < qtdNotas; i++) {
			somatoriaNotas = somatoriaNotas + notas[i];
		}
		
		System.out.println("Sua Média é: " + somatoriaNotas/qtdNotas);
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("Sua nota " + (i + 1) +  " foi " + notas[i]) ;
		}
		sc.close();
	}
}

//public static void main(String[] args) {
//	//Array
//	int nota = 10;
//	int notas[] = new int[3];
//	String nomes[] = new String[10];
//	double altura[] = new double[200];
//	
//}
//public static void main(String[] args) {
//	
//	//Quanto mais notas, mais variaveis eu preciso criar
//	int nota1 = 10, nota2 = 7, nota3 = 8, nota4 = 5, nota5 = 7, nota6 = 9;
//	//E se em uma escola/professor nao usa 6 notas, mas apenas 4 ou 20
//	
//	
//	System.out.println("nota 1: " + nota1);
//	System.out.println("nota 2: " + nota2);
//	System.out.println("nota 3: " + nota3);
//	System.out.println("nota 4: " + nota4);
//	System.out.println("nota 5: " + nota5);
//	System.out.println("nota 6: " + nota6);
//	System.out.println("Média: " + ((nota1 + nota2 + nota3 + nota4 + nota5 + nota6)/6));
//	
//	
//}