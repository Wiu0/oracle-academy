import java.util.Scanner;

/*
	Objetivo: saber quanto eu devo cobrar pelo meu serviço(Revestir paredes).
	Como: Calcula a area da parede(m2), multiplica por um preço variavel. 
	Historia: 
	1. Informe o valor do metro quadrado
	2. Informe a quantidade de areas
	3. Iniciar o pedido das laterais de cada area
	4. Mostrar o metro2 e valor de cada area
	5. Mostrar somatoria de metro2 e valor de tudo que foi informado
*/
public class Orcamento {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Informe o valor do metro quadrado");
		double valorMetroQuadrado = sc.nextDouble();
		System.out.println("Informe a quantidade de paredes");
		short quantidadeAreas = sc.nextShort();
		double totalMetrosQuadrados = 0;
		double totalValorOrcamento = 0;
		double metroX, metroY, areaParede, valorParede;
		
		//Iniciar o pedido das laterais de cada area(Laço de repetição)
		for(int i = 0; i < quantidadeAreas; i++) {
			System.out.println("Informe o valor(em metros) x da parede " + i);
			metroX = sc.nextDouble();
			System.out.println("Informe o valor(em metros) y da parede " + i);
			metroY = sc.nextDouble();
			areaParede = metroX * metroY;
			valorParede = areaParede * valorMetroQuadrado;
			System.out.println("Area da parede "  + i + " é "  + areaParede);
			System.out.println("Valor da parede " + i + " é "  + valorParede);
			
			totalMetrosQuadrados = totalMetrosQuadrados + areaParede;
			totalValorOrcamento += valorParede;
		}
		System.out.println("\n\n----======ORCAMENTO=======----");
		System.out.println("Area Total : "  + totalMetrosQuadrados);
		System.out.println("Valor Total: "+ totalValorOrcamento);
		System.out.println("----======ORCAMENTO=======----");
		
		sc.close();
	}
}