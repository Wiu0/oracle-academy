
public class Person {

	String nome = "";
	String endereco;
	byte qtdPessoasCasa;
	boolean temFilhos;
	double renda;
	int idade;

	String getDetail() {
		String dadosCompletos = "Nome: " + nome + " \nEndereco: " + endereco + "\nRenda: " + renda
				+ " \nidade:" + idade;
		return dadosCompletos;
	}

}
