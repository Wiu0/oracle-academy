package laco_repeticao;
import java.io.IOException;

public class DoWhileVsWhile {

	public static void main(String[] args) throws IOException {
		
		System.out.println("While");
		int i = 0;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("Fim do i while: " + i);
		
		System.out.println("\nDo while");
		i = 0;
		do {
			System.out.println(i);
			i--;
		} while(i > 0);
		System.out.println("Fim do i no do while: " + i);
	}
}
//for e while podem executar nenhuma vez o bloco de execucao
//do while executa 1 vez no minimo o bloco de execucao