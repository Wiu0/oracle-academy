import javax.swing.JOptionPane;

public class Z_AlunoTeste {

	public static void main(String[] args) {
		Z_Aluno al = new Z_Aluno();
		al.nome = "Wiu";
		al.nota1 = 5;
		al.nota2 = 10;
		al.nota3 = 9;
		
		double media = al.calcularMedia();
		System.out.println("a media " + media);
	
		al.nome = "Maria";
		al.nota1 = 10;
		al.nota2 = 9;
		al.nota3 = 5;
		
		JOptionPane.showMessageDialog(null, "A media " + al.calcularMedia());
	}
}