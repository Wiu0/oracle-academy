import java.util.Scanner;

public class ContarFrases {

	//Se basear nos espaços.
	
	//Contar os espaços em branco
	//Exemplo: "William"
	//Qtd espacoes em branco: 0 + 1 = 1
	//Quantidade palavras = 1
	
	//Pesquisou tudo sobre o scanner
	/*
	 * Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo");
		String frase = sc.nextLine();
		sc.close();
		
		int quantidadeEspacos = 0;
		int tamanhoFrase = frase.length();
		
		for(int i = 0; i < tamanhoFrase; i++) {
			char letra = frase.charAt(i);
			if(letra == ' ') {
				quantidadeEspacos++;
			}	
		}
		System.out.println(quantidadeEspacos + 1);
	 */
	
	//
	/*
	 * 	Scanner sc = new Scanner(System.in);
		System.out.println("Digite algo");
		String frase = sc.nextLine();
		sc.close();
		String[] palavras = frase.split(" ");
		int numeroPalavras = palavras.length;
		System.out.println(numeroPalavras);
		
	 */
	
	public static void main(String[] args) {
		System.out.println(
				new Scanner(System.in)
				.nextLine()
				.split(" ")
				.length);
	}
}
