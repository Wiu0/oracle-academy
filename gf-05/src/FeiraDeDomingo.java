import java.util.Scanner;

public class FeiraDeDomingo {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Quantas laranjas vc quer?");
		double tL = sc.nextInt() * 2.1;
		System.out.println("Quantas bananas vc quer?");
		double tB = sc.nextInt() * 1.5;
		System.out.println("Quantas morangos vc quer?");
		double tM = sc.nextInt() * 4;
		sc.close();
		
		System.out.println("Total laranjas: " + tL);
		System.out.println("Total bananas: " + tB);
		System.out.println("Total morangos: " + tM);
		System.out.println("Total: " + (tB + tM + tL));
		
	}
}
