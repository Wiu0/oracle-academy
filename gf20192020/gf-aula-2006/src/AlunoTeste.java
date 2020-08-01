
public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno al = new Aluno();
		al.setNome("Wiu");
		al.setNota1(10.0);
		al.setNota2(9.8);
		al.setNota3(10.0);

		
		al.calcularMedia();
		
		Aluno al1 = new Aluno();
		al1.setNome("Maria");
		al1.setNota1(10.0);
		al1.setNota2(9.8);
		al1.setNota3(10.0);

		
		al1.calcularMedia();
	}
}
