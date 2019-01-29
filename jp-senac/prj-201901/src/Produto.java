
//colunas COD_BARRA, DESCRICAO, PRECO
public class Produto extends Tabela {

	@Override
	public void definirColunas() {
		colunas = new String[] {"COD_BARRA", "DESCRICAO", "PRECO"};
	}
}
