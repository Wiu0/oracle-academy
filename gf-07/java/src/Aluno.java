
public class Aluno {

	String nome;
	String endereco;
	boolean temFilhos;
	short quantidadePessoaNaCasa;
	int idade;
	static double rendaMensal;

	public Aluno() {
	}
	
	public Aluno(String n, int i) {
		nome = n;
		idade = i;
		endereco = "NAO INFORMADO";
	}
	
	public Aluno(String nome, String endereco, boolean temFilhos, short quantidadePessoaNaCasa, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.temFilhos = temFilhos;
		this.quantidadePessoaNaCasa = quantidadePessoaNaCasa;
		this.idade = idade;
	}

	public void apresentarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Ende: " + endereco);
	}
}
