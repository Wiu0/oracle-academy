
public class MediaAluno {

	public static void main(String[] args) {
		
		double nota1Maria = 6;
		double nota2Maria;
		nota2Maria = 8;
		double nota3Maria = 9;
		
		double nota1Pedro = 10, nota2Pedro, nota3Pedro = 5;
		nota2Pedro = 8;
		
		System.out.println((nota1Maria + nota2Maria + nota3Maria)/3);
		System.out.println((nota1Pedro + nota2Pedro + nota3Pedro)/3);
		
		
		int pesoProva1 = 2;
		//o numeor 3 é o peso da segunda prova dos alunos
		System.out.println((nota1Maria * pesoProva1  + nota2Maria * 3 + nota3Maria * 5)/10);
		System.out.println((nota1Pedro * pesoProva1 + nota2Pedro * 3 + nota3Pedro * 5)/10);
		
	}
}
