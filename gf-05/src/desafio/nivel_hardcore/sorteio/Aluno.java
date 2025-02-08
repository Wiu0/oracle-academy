package desafio.nivel_hardcore.sorteio;

public class Aluno {

	private String nome;
	
	private Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	static class Builder {
		String nome;
		
		public Builder nome(String name) {
			this.nome = name;
			return this;
		}
		
		public Aluno build() {
			return new Aluno(nome);
		}
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
