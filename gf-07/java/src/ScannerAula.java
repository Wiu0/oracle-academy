import java.util.Scanner;

public class ScannerAula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		sc.nextLine();
		String a = sc.nextLine();
		System.out.println(a);
		sc.close();
	}
}
