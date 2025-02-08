package br.com.gerando.falcoes.turma7.greenfoot;

public class Actor {

	public void act() {
		
	}
	
	String getName() {
		return "Ator a";
		
	}
	int getY() {
		return 100;
	}
	
	int getX() {
		return 50;
	}
	
	void setLocation(int x, int y) {
		System.out.println("mover personagem X " + x + " e Y " + y);
	}
	
	void move(int deslocamento) {
		System.out.println("Estou movendo " + deslocamento + " metros");
	}

	void turn() {
		System.out.println("Estou virando o personagem");
	}

	void isAtEdge() {
		System.out.println("Estou no limite da tela?");
	}

	void main(String[] args) {
		move(1);
		setLocation(30, 10);
		int posicaoY = getY();
		System.out.println(posicaoY);
	}
}
