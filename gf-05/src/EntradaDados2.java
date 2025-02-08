import java.util.Scanner;

public class EntradaDados2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String nomeCompleto = sc.next();
//	
//		System.out.println("Seu nome é: " + nomeCompleto);
//		System.out.println(sc.next());
//		
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		
		sc.close();
	}
	/*
	 * Vou utilizar dados decimais?
	 * Se SIM
	 *    double ou float
	 * Vou utilizar dados inteiros?
	 * Se SIM    
	 *     byte, short, int, long
	 *     
//	 */
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		short idade1 = sc.nextShort();
//		short idade2 = sc.nextShort();
//		short idade3 = sc.nextShort();
//		System.out.println(idade1 + idade2 + idade3);
//		
//		sc.close();
//	}
}
