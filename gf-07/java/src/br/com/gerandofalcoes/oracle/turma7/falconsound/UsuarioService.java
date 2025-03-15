package br.com.gerandofalcoes.oracle.turma7.falconsound;

public class UsuarioService {
	
	private UsuarioRepositorio repo = new UsuarioRepositorio();
	
	public void salvar(Usuario usuario) {
		System.out.println("Validar as informacoes e salvar");
		if(!usuario.getEmail().contains("@")) {
			System.out.println("Email invalido");
		}
	
		repo.save(usuario);
	}
}
