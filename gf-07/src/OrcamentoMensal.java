import java.util.Scanner;

/*
 * Pedir o mes
Pegar as despesas desse mes
pegar a renda
calcular o quanto sobrou ou
se esta devendo e mostrar
se deu bom e se deu ruim

 */
public class OrcamentoMensal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ola ana");
		System.out.println("mes?");
		String mes = sc.nextLine();
		System.out.println("Qtd Despesas no mes " + mes + "?");
		int quantidadeDespesas = sc.nextInt();
		double totalDespesa = 0;
		for(int i = 1;  i <= quantidadeDespesas; i++) {
			System.out.println("Despesas " + i);
			totalDespesa += sc.nextDouble();
		}
		System.out.println("Renda: ");
		double renda = sc.nextDouble();
		double resultado = 	renda - totalDespesa;
		
		if(resultado > 0) {
			System.out.println("deu bom " + resultado);
		} else if (resultado < 0) {
			System.out.println("deu ruim " + resultado);
		} else {
			System.out.println("Zerou na cagada");
		}
		sc.close();
	}
}
