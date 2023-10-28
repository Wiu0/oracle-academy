package retorno;

public class CelularTeste {

	
	public static void main(String[] args) {
		Celular c = new Celular();
		
		c.cor = "Preto";
		c.numero = 11988214565l;
		
		c.desligar();
		c.ligar();
		c.fazerChamadaDeVoz();

		
		
		c.verListaDeContato();
		
		
	}
	
}
