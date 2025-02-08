package desafio.facil;

public class DistanciaMovimentacao {
	
	public static void main(String[] args) {
		int quantidadePercusos = 3;
		double quantidadeKm = 0;
		double totalKm = 0;
		
		for(int i = 0; i < quantidadePercusos; i++) {
			//Capturar o dado do usuario/carro
			quantidadeKm = 1 + (Math.random() * 49);
			System.out.println(
					"Percurso " + i + " : " + quantidadeKm);
			totalKm += quantidadeKm;
		}
		System.out.println("Total Percorrido: " + totalKm);
	}
	

}
