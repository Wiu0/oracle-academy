import java.util.Scanner;

public class DesafioAnoNascimento {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int minhaIdade = sc.nextInt();
		
		int anoNascimento = 2021 - minhaIdade;
		System.out.print("O ano atual é ");
		System.out.println(2021);
		System.out.print("Sua idade atual é ");
		System.out.println(minhaIdade);
		System.out.print("Sua ano de nascimento é ");
		System.out.print(anoNascimento);
		sc.close();
//		Entradas
		//Notas
		//[8, 10, 4]
		//[5, 7, 7]
		//[10, 10, 0]
		//[5, 7, 8]
		//Pesos
		//{2, 4, 8}
		
//Saida
		//Sua media ponderado foi {media_ponderada_calculada}
		
		
		
	}
}
//Media aritmetica => 
//soma os elementos e divide pela quantidade de elementos

//exemplo: Elementos [3, 7, 10] - Ana
//exemplo: PESO [1, 1, 1] - Ana
//media = (3*1 + 7*1 + 10*1)/3 
//media = 6.6667

//exemplo: Elementos [10, 7, 3] - Maria
//media = (10 + 7 + 3)/3 
//media = 6.6667


//Media ponderada => 
//Multiplicaca de cada elemento por um peso e somar o resultado desses multiplicacoes
//e divide pela soma desses pesos

//exemplo: Elementos [3, 7, 10] - Ana
//exemplo: PESO [4, 8, 16] - Ana
//media = (3*2 + 7*3 + 10*5)/10
//media = (6 + 21 + 50)/10
//media = 77/10
//media = 7.7

//exemplo: Elementos [10, 7, 3] - Maria
//exemplo: PESO [2, 3, 5] - Maria
//media = (10 * 2 + 7 * 3 + 3 * 5)/10
//media = (20 + 21 + 15)/10
//media = 56/10
//media = 5.6