package construtor;

public class CadastradoFuncionario {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Wiu", "AA");
		
		System.out.println("Salvando pessoa no banco de dados");
		System.out.println("Parabens " + p.nome + " de passaporte " + p.passaporte + ". Cadastro realizado com sucesso.");
//		//Parabens ? de passaporte BR123132. Cadastro realizado com sucesso.
	}
	
}
