import java.util.Scanner;

public class LacoDaVida {

	public static void main(String[] args) {
//		
//		System.out.println(nrTab + "0 = 60 \n5 x 1 = 5 \n5 x 2 = 10 \n5 x 3 = 15"
//				+ "\n5 x 4 = 20 \n5 x 5 = 25 \n5 x 6 = 30 \n5 x 7 = 35" + "\n5 x 8 = 40 \n5 x 9 = 45 \n5 x 10 = 50");
		Scanner sc = new Scanner(System.in);
		int nrTab = sc.nextInt();
		sc.close();
		
		System.out.println(nrTab + " x 0 = " + nrTab * 0);
		System.out.println(nrTab + " x 1 = " + nrTab * 1);
		System.out.println(nrTab + " x 2 = " + nrTab * 2);
		System.out.println(nrTab + " x 3 = " + nrTab * 3);
		System.out.println(nrTab + " x 4 = " + nrTab * 4);
		System.out.println(nrTab + " x 5 = " + nrTab * 5);
		System.out.println(nrTab + " x 6 = " + nrTab * 6);
		System.out.println(nrTab + " x 7 = " + nrTab * 7);
		System.out.println(nrTab + " x 8 = " + nrTab * 8);
		System.out.println(nrTab + " x 9 = " + nrTab * 9);
		System.out.println(nrTab + " x 10 = " + nrTab * 10);
	}
}
