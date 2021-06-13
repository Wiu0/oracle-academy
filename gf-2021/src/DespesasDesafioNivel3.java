import java.util.Scanner;

public class DespesasDesafioNivel3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double agua = sc.nextDouble();
		double luz = sc.nextDouble();
		double internet;
		internet = sc.nextDouble();
		
		double gas = sc.nextDouble(), mercado = sc.nextDouble();
		
		System.out.println(agua + luz + internet + gas + mercado);
		
		sc.close();
	}
}
