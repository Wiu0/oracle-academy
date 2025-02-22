
public class AlunoTreino {
	
	public static void main(String[] args) {

		Aluno a0 = new Aluno("Ana", 1);
		Aluno a1 = new Aluno("Wiu", 10);
		Aluno a2 = new Aluno();
		Aluno a3 = 
				new Aluno("P", "a", true, (short)1, 10);
		
		a0.apresentarDados();
		a1.apresentarDados();
		a2.apresentarDados();
		a3.apresentarDados();
	}
}
