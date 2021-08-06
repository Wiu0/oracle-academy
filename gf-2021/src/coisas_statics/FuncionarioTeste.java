package coisas_statics;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Ana";
		f1.salario = 1000;
		f1.idade = 18;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Pedro";
		f2.salario = 900;
		f2.idade = 19;
		
//		
//		Funcionario.nome = "JOAO";
//		Funcionario.salario = 79;
		//Funcionario.idade = 12;
		Funcionario.calcular();

		System.out.println(f1.nome);
		System.out.println(f1.salario);
		System.out.println(f1.idade);
		
		

		System.out.println(f2.nome);
		System.out.println(f2.salario);
		System.out.println(f2.idade);
		
	}


//	Funcionario.nome = "Ana";
//	Funcionario.salario = 1000;
//	
//	Funcionario.nome = "Pedro";
//	Funcionario.salario = 900;
	
	
//	Funcionario f1 = new Funcionario();
//	f1.nome = "Ana";
//	f1.salario = 1000;
//	
//	
//	Funcionario f2 = new Funcionario();
//	f2.nome = "Pedro";
//	f2.salario = 900;
//	
//	f1.salario = 3000;
	
}
