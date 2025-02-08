import java.util.Scanner;

public class EntradaDeDados {

	
	public static void main(String[] args) {
		//Scanner
		//int, boolean, long
		
		
		Scanner entradaDeValoresPeloUsuario = new Scanner(System.in);
		
		//Pare o codigo, aguarde o usuario apertar enter e devolva o que o usuario digitou
		//entradaDeValoresPeloUsuario.nextDouble();
		double valorDigitado = entradaDeValoresPeloUsuario.nextDouble();
	
		System.out.println("O usuario digitou: " + valorDigitado);
		
		System.out.println(valorDigitado + 100);
		
		System.out.println(valorDigitado * 100);
		
		String nome = entradaDeValoresPeloUsuario.next();
		System.out.println("Nome do usuario é " + nome);
	
		entradaDeValoresPeloUsuario.close();
		
		//Math
		//Usa outra funcionalidade
		
		
		
	}
}
