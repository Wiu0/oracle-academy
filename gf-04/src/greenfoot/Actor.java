package greenfoot;

public class Actor {

	
	void mover(int distancia) {
		System.out.println("Movimentou o ator " + distancia);
	}
	
	void virar(int graus) {
		System.out.println("Virando o ator " + graus);
	}
	
	boolean	estaNoLimiteDaTela() {
		return false;
	}
	
}
