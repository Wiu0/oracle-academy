import java.util.Scanner;

public class ExemploLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String listaNomes[] = new String[1000]; 

		for(int i = 0; i < listaNomes.length; i++) {
			listaNomes[i] = sc.nextLine();			
		}
		
		for(int i = 0; i < listaNomes.length; i++) {
			System.out.println(listaNomes[i]);			
		}
		sc.close();
	}
}
