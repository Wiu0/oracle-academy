package desafio.nivel_hardcore.sorteio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorteio {

	public List<GrupoAluno> sortear(List<Aluno> alunos, byte quantidadeAlunosGroupo) {
		List<GrupoAluno> grupos = new LinkedList<>();

		Collections.shuffle(alunos);
		System.out.println(alunos);
		int quantidadeGrupos = (int) Math.round(alunos.size() / (quantidadeAlunosGroupo + 0.0));
		int j = 0;
		GrupoAluno g = new GrupoAluno();
		int i = 0;
		
		for (; j < quantidadeGrupos; j++) {
			g = new GrupoAluno();
			g.nome = "Grupo " + j;
			g.alunos = new LinkedList<>();
			
			int limite = i + quantidadeAlunosGroupo;
			for (; i <  limite; i++) {
				g.alunos.add(alunos.get(i));
			}
			grupos.add(g);
		}
		return grupos;
	}

	public static void main(String[] args) {
		Sorteio s = new Sorteio();

		List<Aluno> l = new LinkedList<>();
		for(int i = 0; i < 30; i++)
		l.add(new Aluno.Builder().nome("Aluno" + i).build());

		List<GrupoAluno> groups = s.sortear(l, (byte) 5);
		groups.forEach(System.out::println);
	}

}
