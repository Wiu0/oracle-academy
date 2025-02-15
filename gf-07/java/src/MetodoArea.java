
public class MetodoArea {
	public static double calcularAreaQuadrado(double ladoQuadrado) {
		double area = ladoQuadrado * ladoQuadrado;
		return area;
	}
	public static double calcularAreaCirculo(double raioCirculo) {
		double area = Math.PI * raioCirculo * raioCirculo;
		return area;
	}
	public static double calcularAreaRetangulo(double largura, double altura) {
		double area = largura * altura;
		return area;
	}
	public static void mostrarAreas(double areaQuadrado, double areaCirculo, double areaRetangulo) {
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println("Área do círculo: " + areaCirculo);
		System.out.println("Área do retângulo: " + areaRetangulo);
	}
	public static void main(String[] args) {
		double ladoQuadrado = 5;
		double raioCirculo = 3;
		double larguraRetangulo = 4;
		double alturaRetangulo = 6;
		double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
		double areaCirculo = calcularAreaCirculo(raioCirculo);
		double areaRetangulo = calcularAreaRetangulo(larguraRetangulo, alturaRetangulo);
		mostrarAreas(areaQuadrado, areaCirculo, areaRetangulo);
	}
}
