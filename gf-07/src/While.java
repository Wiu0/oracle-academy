import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner("c:/oi.txt");
		
		while(sc.hasNextLine()) {
			System.out.println("Linha do arquivo:" + sc.nextLine());
		}
		
		for( ;sc.hasNextLine(); ) {
			System.out.println("Linha do arquivo:" + sc.nextLine());
		}
		
		for(int j = 0; j < 1000; j++) {
			System.out.println("ola");
		}
		
		int k = 0;
		while(k < 1000) {
			System.out.println("ola"); 
			k++;
		}
	}
}
