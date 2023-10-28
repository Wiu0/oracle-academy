import java.util.Scanner;

public class ContadorPalavras {

	
	//Como contar palavras em uma String
	//metodo length: Metodo que conta quantos caracteres tem dentro
	//de um texto.
	//Exemplo: 
	/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto");
		String frase = sc.nextLine();
		int quantidadeLetras = frase.length();
		System.out.println("Quantidade " + quantidadeLetras);
		sc.close();
	 */
	
	
	//split: Separar um texto por um caracter definido
	//Exemplo: William,Ana,Bruno,Jose
	//SPLIT(a) => 4 String
	// Willi
	// m,An
	// ,Bruno,Jose
	/*
	 * Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto");
		
		String frase = sc.nextLine();
		String[] palavras = frase.split("\\s+");
		
		sc.close();
	 */
	/*
	 * 
		System.out.println(
				new Scanner(System.in)
				.nextLine()
				.split(" ")
				.length);
	 */
	public static void main(String[] args) {
		
		String frase = "Oi Tudo dsds dsads å bem?";
		int quantidadeCaracteres = frase.length();
		int quantidadePalavras = 1;
		int quantidadeLetraA = 0;
		
		for(int i = 0; i < quantidadeCaracteres; i++) {
			if(frase.charAt(i) == ' ') {
				quantidadePalavras++;
			}
		}
		
		System.out.println(quantidadePalavras);		
	}
}



