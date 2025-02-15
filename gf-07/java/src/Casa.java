
public class Casa {

	public static void main(String[] args) {
		Celular c = new Celular();
		Ventilador v = new Ventilador();
		c.cor = "azul";
		v.cor = "branca";
		
		c.ligar();
		v.desligar();
		
	}
}
