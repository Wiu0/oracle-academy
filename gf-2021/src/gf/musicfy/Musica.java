package gf.musicfy;

public class Musica {
	
	//tipo_variavel nome_variavel
	public String nome;
	public String genero;
	public double duracao;
	public String artista;
	public byte pontuacao;
	
	void tocar() {
	}
	
	void parar() {
		
		System.out.println("deveria parar a musica");
	}
	
	void darNota(byte nota) {
		pontuacao = nota;
	}
	
}
