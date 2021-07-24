package gf.musicfy;

import java.util.Scanner;

public class MusicfyStarter {

	public static void main(String[] args) {

		Musica minhaMusica = new Musica();

		minhaMusica.nome = "céu azul";
		minhaMusica.artista = "CBJ";
		minhaMusica.duracao = 3.20;

		minhaMusica.tocar();
		minhaMusica.parar();
		minhaMusica.darNota((byte)4);
		
		System.out.println("O Nome da musica é: " + minhaMusica.nome);
		
	}
}
