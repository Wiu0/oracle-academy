package br.com.kroton.scanner;

import java.io.Closeable;
import java.io.IOException;

import br.com.kroton.aluno.Aluno;
import br.com.kroton.funcionario.Funcionario;
import br.com.kroton.professor.Professor;
import br.com.kroton.seguranca.Seguranca;
import br.com.kroton.usuario.Coordenador;
import br.com.kroton.usuario.Usuario;

public class UsuarioTeste {

	//	public static void printNomeProfessor(Professor p) {
	//		System.out.println("Professor: " + p.getNome());		
	//	}
	//	
	//	public static void printNomeSeguranca(Seguranca s) {
	//		System.out.println("Seguranca: " + s.getNome());
	//	}
	//	
	//	public static void printNomeAluno(Aluno a) {
	//		System.out.println("Aluno: " + a.getNome());
	//	}

	public static void printNomeUsuario(Usuario u) {
		System.out.println("Usuario: " + u.getNome() + " NA: " + u.getNivelDeAcesso());
	}

	public static void printNomeUsuarioSalario(Funcionario f) {
		System.out.println("Usuario: " + f.getNome() + "\nSalario: " + 
				f.calcularSalario());
	}

	public static void main(String[] args) {
		
		Funcionario p = new Professor();
		Funcionario s = new Seguranca();
		Funcionario c = new Coordenador();
		Usuario a = new Aluno("William", "Rua ali", (short)20, 1.9);
		//		Usuario u  = new Usuario(); Asbtract
		printNomeUsuario(a);
		printNomeUsuario(p);
		printNomeUsuario(s);
		printNomeUsuario(c);
		//		printNomeUsuarioSalario(a);ERRO NAO É FUNCIONARIO, APENAS USUARIO
		printNomeUsuarioSalario(p);
		printNomeUsuarioSalario(s);
		mostrar((RegraAcessoSala)a);
		mostrar((RegraAcessoSala)p);
		try (Aluno aa = new Aluno("", "", (short)1, 1)) {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	static void mostrar(RegraAcessoSala r) {
		r.comparacer();
	}

	static void close(Closeable c) throws IOException {
		c.close();

	}

}
