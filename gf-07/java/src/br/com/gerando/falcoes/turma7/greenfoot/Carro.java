package br.com.gerando.falcoes.turma7.greenfoot;
import br.com.gerando.falcoes.turma7.greenfoot.Actor;

public class Carro extends Actor { 
	
	public void act() {
		move(3);
		if(getX() > 100) {
			System.out.println("Virar");
		} else {
			System.out.println("Parar o personagem");
		}
	}
}
