package despesas;

public class GerenciamentoCasa {

	public static void main(String[] args) {
		Despesa despesa1 = new Despesa();
		despesa1.nome = "Conta de luz";
		despesa1.tipo = "Fixa";
		despesa1.jurosAtrasoPorDia = 0.10;
		despesa1.quantidadeDiasAtrasadas = 20;
		despesa1.valor = 200.45;
		
		System.out.println(despesa1.calcularValorTotalAPagar());
	
	
		Despesa despesa2 = new Despesa();
		despesa2.nome = "Compra cadeira";
		despesa2.tipo = "Imprevistos";
		despesa2.jurosAtrasoPorDia = 5;
		despesa2.quantidadeDiasAtrasadas = 0;
		despesa2.valor = 700.80;
		
		System.out.println(despesa2.calcularValorTotalAPagar());
	}
	
}
