import java.util.Scanner;

public class Challange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		int idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("Você não é maior de idade, pois você tem " + idade + " anos");
		} else {
			System.out.println("Você é maior de idade, pois você tem " + idade + " anos");
		}
		sc.close();
	}
	
}
