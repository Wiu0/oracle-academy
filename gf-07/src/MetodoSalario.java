
public class MetodoSalario {
	public static void main(String[] args) {
		double salarioBase = 3000.0;
		double desconto = salarioBase * 0.1;
		double bonus = salarioBase * 0.2;
		double salarioFinal = salarioBase - desconto + bonus;
		System.out.println("Salário final: " + salarioFinal);
	}
}
