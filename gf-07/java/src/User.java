import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte idade = sc.nextByte();
		
		System.out.println("Capturei: " + idade);
		System.out.println(2024 - idade);
	}
}
