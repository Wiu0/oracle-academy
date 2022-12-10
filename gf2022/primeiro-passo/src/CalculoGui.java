
public class CalculoGui {

	public static void main(String[] args) {
		double cg = 1 + Math.random() * 3;
		double qk = 1 + Math.random() * 3;
		double tk = 0;
		double kl;

		for (int i = 0; i < 3; i++) {
			qk = 1 + Math.random() * 3;
			tk += qk;
			System.out.println("Percuso igual " + qk);
		}
		kl = cg / tk;
		System.out.println(kl);
	}

}
