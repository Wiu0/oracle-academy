package construtor;

public class Pessoa {
	
	String nome;
	String passaporte;
	int dataNascimento;

	public Pessoa(String nome, String passaporte) {
		this.nome = nome;
		this.passaporte = passaporte;
		nome = nome + " parametro construtor";
		this.nome = this.nome + " atributo da classe";
		System.out.println(nome);
		System.out.println(this.nome);
	}
	
	public void falarNome(String nome) {
		int dataNascimento = 0;
		System.out.println(nome);
		System.out.println(this.nome);
		System.out.println(this.passaporte);
		System.out.println(passaporte);
		System.out.println(dataNascimento);
		System.out.println(this.dataNascimento);
	}
}




//Pessoa p = new Pessoa("OI", "xau")
//p.nome ===> OI