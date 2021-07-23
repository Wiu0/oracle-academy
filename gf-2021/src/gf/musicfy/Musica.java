package gf.musicfy;

public class Musica {
	
	//tipo_variavel nome_variavel
	String nome;
	String genero;
	double duracao;
	String artista;
	byte pontuacao;
	
	void tocar() {
		System.out.println("deveria tocar a musica");
	}
	
	void parar() {
		System.out.println("deveria parar a musica");
	}
	
	void darNota(byte nota) {
		pontuacao = nota;
	}
	
}
