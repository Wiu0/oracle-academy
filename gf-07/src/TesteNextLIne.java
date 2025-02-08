import java.util.Scanner;

public class TesteNextLIne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo");
		String aaa = sc.nextLine();
		sc.close();
		System.out.println("Usuario digitou:");
		System.out.println(aaa);
	}
}
