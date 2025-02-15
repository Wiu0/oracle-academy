package br.com.gerando.falcoes.turma7.loop;

public class LoopForeach {

	public static void main(String[] args) {
		int notas[] = new int[10];
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(notas[i]);
		}
	}
}
