
public class Z_Aluno {

	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	//Forma nova. Metodo possui uma responsabilidade, calcular a media e devolve esse valor 
	double calcularMedia() {
		double media = (nota1 + nota2 + nota3)/3;
		return media;
	}
	
	/* Forma antiga. Metodo possui duas responsabilidades, calcular e apresentar
	 void calcularMedia() {
		double media = (nota1 + nota2 + nota3)/3;
		System.out.println(media);
	}
	*/
	
}
