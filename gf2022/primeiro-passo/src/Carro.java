
public class Carro {
	
	double combustivelGasto = 0;
	double totalKm = 0;
	double mediaLitro;
	
	public void calcularMediaLitroKm() {
		mediaLitro = totalKm/combustivelGasto;
	}

	public void addCombustivelGasto(double gasto) {
	 combustivelGasto += gasto;
	}
}
