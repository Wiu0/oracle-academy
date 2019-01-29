
public abstract class Tabela {

	public String colunas[];
	
	public Tabela() {
		definirColunas();
	}
	
	public abstract void definirColunas();

	public static void mostrarColunas(Tabela t) {
		for(String c : t.colunas) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		Cliente c = new Cliente();
		mostrarColunas(c);
		
		Produto p = new Produto();
		mostrarColunas(p);
	}
	
}
