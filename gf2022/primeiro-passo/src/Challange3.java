import java.util.Scanner;

public class Challange3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\tAnalisador de movimento GF");
		System.out.println("Informe a peça de xadrez");
		String peca = sc.next();
		System.out.println("Informe a letra da casa atual do " + peca);
		String casaAtualLetra = sc.next();
		
		System.out.println("Informe o numero da casa atual do " + peca);
		String casaAtualNumero = sc.next();
		
		
		System.out.println("Informe a letra da casa que deseja mover a peça " + peca);
		String casaDesejadaLetra = sc.next();
		
		System.out.println("Informe o numero da casa que deseja mover a peça " + peca);
		String casaDesejadaNumero = sc.next();
		
		if(peca.equals("rei")) {
			System.out.println("Esse movimento é valido");
		}

	}
	
}
