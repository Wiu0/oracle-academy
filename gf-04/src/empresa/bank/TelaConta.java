package empresa.bank;

public class TelaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.agencia = 1;
		conta.contaCorrente = "1234";
		
		System.out.println(conta.verSaldo());
		
		conta.depositar(1000.11);
		
		System.out.println(conta.verSaldo());
		
		conta.depositar(550);
		System.out.println(conta.verSaldo());
		
		
	}
}
