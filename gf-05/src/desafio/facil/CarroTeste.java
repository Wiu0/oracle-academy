package desafio.facil;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.marca = "Ford";
		c1.modelo = "Fiesta";
	 	for (int j = 0; j < 2; j++)
			c1.somarPercurso();
		c1.mostrarDadosGerais();
		
		System.out.println("====================");

		Carro c2 = new Carro();
		c2.marca = "Jeep";
		c2.modelo = "Renegade";
		
		for (int j = 0; j < 2; j++)
			c2.somarPercurso();
		c2.mostrarDadosGerais();
		System.out.println("====================");
		
	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Quantidade de carros a informar");
//		int quantidadeCarros = Integer.parseInt(sc.nextLine());
//
//		for (int i = 0; i < quantidadeCarros; i++) {
//			System.out.println("Informe a marca");
//			Carro.marca = sc.nextLine();
//			System.out.println("Informe o modelo");
//			Carro.modelo = sc.nextLine();
//			for (int j = 0; j < 2; j++)
//				Carro.somarPercurso();
//			Carro.mostrarDadosGerais();
//			System.out.println("====================");
//
//		}
//		sc.close();
//	}
}
