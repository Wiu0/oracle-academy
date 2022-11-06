package desafio.facil;

public class Carro {

	String marca;
	String modelo;
	double totalKm; 
	
	public void somarPercurso() {
		double quantidadeKm = 1 + (Math.random() * 49);
		System.out.println("Percurso : " + quantidadeKm);
		totalKm += quantidadeKm;
		
	}
	
	public void mostrarTotalKm() {
		System.out.println("Total Percorrido : " + totalKm);
	}
	
	public void mostrarDadosGerais() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Km Total: " + totalKm);
		System.out.println("Km/L: ");
		
	}
	
}
