import javax.swing.JOptionPane;

public class MediaAlunoJOption {

	
	public static void main(String[] args) {
		//Como fazer input com JOptionPane
		//Como fazer output com JOptionPane
		
		//JOptionPane.showInputDialog = Scanner 

		String nome = JOptionPane.showInputDialog(null, "Qual seu nome?", "Adivinhando quando vc nasceu", JOptionPane.INFORMATION_MESSAGE);

		String idadeUsuarioTexto = JOptionPane.showInputDialog(null, "Qual sua idade?", "Adivinhando quando vc nasceu", JOptionPane.INFORMATION_MESSAGE);
		
		long idadeUsuarioNumero = Long.parseLong(idadeUsuarioTexto);
		long anoNascimento = 2020 - idadeUsuarioNumero;
		
		String massaUsuarioTexto = JOptionPane.showInputDialog(null, "Qual sua massa?", "Adivinhando quando vc nasceu", JOptionPane.INFORMATION_MESSAGE);
		double massaUsuarioNumero = Double.parseDouble(massaUsuarioTexto);
		

		if(idadeUsuarioNumero < 18) {
			JOptionPane.showMessageDialog(null, nome +  ", vc nasceu no ano de " + anoNascimento + " e vc é menor de idade. Sua massa é " + massaUsuarioNumero,
					"Resposta ao usuario", JOptionPane.QUESTION_MESSAGE);
		}else {
			//JOptionPane.showMessageDialog = System.out.print
			JOptionPane.showMessageDialog(null, nome +  ", vc nasceu no ano de " + anoNascimento + " e vc é maior de idade. Sua massa é " + massaUsuarioNumero,
					"Resposta ao usuario", JOptionPane.QUESTION_MESSAGE);		
		}
	}
}
