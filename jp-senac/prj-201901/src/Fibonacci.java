//java -XX:+UnlockDiagnosticVMOptions -XX:+PrintCompilation -Xint Fibonacci 39
//java -XX:+UnlockDiagnosticVMOptions -XX:+PrintCompilation Fibonacci 39
public class Fibonacci {

	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {   
		int qtdTermos = Integer.parseInt(args[0]);
		// teste do programa. Imprime os 30 primeiros termos       
		for (int i = 0; i < qtdTermos; i++) {
			System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
		}
	}

}
