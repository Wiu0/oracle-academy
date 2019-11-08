package br.com.kroton.professor;

import br.com.kroton.funcionario.Funcionario;
import br.com.kroton.scanner.RegraAcessoSala;

public class Professor extends Funcionario implements RegraAcessoSala{

	/*
	 * public int nivelDeAcesso() { return 1; }
	 */

	@Override
	public int getNivelDeAcesso() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public void comparacer() {
		System.out.println("Entrar na sala e dar aula");
	}
}
