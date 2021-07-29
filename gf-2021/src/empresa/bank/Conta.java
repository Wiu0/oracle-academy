package empresa.bank;

public class Conta {

	int agencia;
	String contaCorrente;
	double saldo;
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double verSaldo() {
		return saldo;
	}
	
}
