
public class Variavel {

	public static void main(String[] args) {
		
		//Guardar numero inteiros
		byte idade = 45; // -128 ate 127
		short duracaoFilme = 32767;
		int distancia = 1000000000;
		long qtdPessoas = 10000000000l;
		//Guardar numero decimais
		double peso = 6.6;
		float altura = 77.123f;
		//Guardar o valor verdadeiro ou falso
		boolean contaPaga = true;
		//Guardar um caractere
		char simbolo = '&';
		
		System.out.print("Peso: ");
		System.out.print(peso);
		System.out.println("Paguei a conta? " + contaPaga);
		System.out.println("Idade: " + idade);
		System.out.println("Duracao Filme: " + duracaoFilme);
		System.out.println("Peso: " + peso + peso);
		
		
	}
}
