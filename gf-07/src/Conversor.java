
public class Conversor {

	public static void mostrarMenuInicial() {
		System.out.println("===========================================");
		System.out.println("Bem vindo ao conversor de valores");
		System.out.println("Iremos converter: ");
		System.out.println("metros em quilomentros");
		System.out.println("Celsius em fahrenheit");
		System.out.println("===========================================\n");		
	}

	public static void mostrarKm(double metros, double quilometros) {
		System.out.println(metros + " metros em quilômetros: " + quilometros);
	}
	public static void mostrarFahrenheit(double c, double f) {
		System.out.println(c + " °C em Fahrenheit: " + f);	
	}
	
	public static double calcularMetrosParaQuilometros(double metro) {
		double km = metro/1000;
		return km;
	}
	
	public static double calcularCelsiusParaFahrenheit(double c) {
		double f = (c * 9 / 5) + 32;
		return f;
	}
	
	public static void main(String[] args) {
		
		double metros = 1500;
		double celsius = 25;

		mostrarMenuInicial();
		
		double quilometros = calcularMetrosParaQuilometros(metros);
		double fahrenheit = calcularCelsiusParaFahrenheit(celsius);
		
		mostrarKm(metros, quilometros);
		mostrarFahrenheit(celsius, fahrenheit);
	}	
}