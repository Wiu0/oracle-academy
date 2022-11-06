package desafio.nivel_hardcore.sorteio;

import java.util.List;

public class GrupoAluno {

	public String nome;
	public List<Aluno> alunos;
	
	@Override
	public String toString() {
		return "[Nome: " + nome + "][Alunos: " + alunos + "]";
	}
	
}
