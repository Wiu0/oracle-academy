package br.com.gerandofalcoes.oracle.turma7.falconsound;

public class LoginService {

	public boolean logar(Usuario usuario) {
		if (usuario.getEmail().equals("") && usuario.getSenha().equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
