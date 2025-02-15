package br.com.gerando.falcoes.turma7.greenfoot;

public class SuperClasseGreenfoot {

	public static void main(String[] args) {
		Abelha a = new Abelha();
		Carro c = new Carro();
		
		while(true) {
			//a.act();
			c.act();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
