package br.com.gerancofalcoes.oracle.turma7.falconflix;

import java.util.Scanner;

public class Estudo {

	public void compararTamanhoTexto(String t0, String t1) {
		if(t0.length() > t1.length()) {
			System.out.println("Texto 1 é maior: " + t0);
		} else if(t1.length()> t0.length()) {
			System.out.println("Texto 2 é maior: " + t1);
		} else {
			System.out.println("tem o mesmo tamanho");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto1 = sc.nextLine();
		String texto2 = sc.nextLine();
		
		Estudo comparador = new Estudo();
		comparador.compararTamanhoTexto(texto1, texto2);
		
	}
}
