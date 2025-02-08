package br.com.gerando.falcoes.turma7.greenfoot;

public class Abelha extends Actor {

	public void act() {
		
		Aviao a = new Aviao();
		
		move(2);
		isAtEdge();
		
		int x = getX();
		System.out.println("X da abelha " + x);
	}
}
