package desafio.level1;

public class RendaSalarial {
	
	public static void main(String[] args) {
//		double d = calcularTotalDaRendaSalarial(25, 2000);//System.out
//		System.out.println(d);
//		
//		d = calcularTotalDaRendaSalarial(250, 123);//JOption
//		JOptionPane.showMessageDialog(null, d);
		
		double totalRenda = calcularTotalDaRendaSalarial(1000, 2000);
		double valorReserva = calcularReserva(totalRenda);
		System.out.println(valorReserva);
		
	}

	static double calcularTotalDaRendaSalarial(double salarioPessoa1, double salarioPessoa2) {
		double valorTotal = salarioPessoa1 + salarioPessoa2;
		return valorTotal;
	}	
	
	static double calcularReserva(double totalRenda) {
		double valor = totalRenda * 0.2;
		return valor;
	}
}
