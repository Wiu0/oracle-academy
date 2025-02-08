package elisa;

import java.io.File;

public class GerenciadorArquivoTeste {

	
	public static void main(String[] args) {
		GerenciadorArquivo ga = new GerenciadorArquivo();
		
		boolean sucesso;
		if(ga.existeArquivo("teste.txt", "./turma/gf/elisa/") == false) {
			sucesso =  ga.criarArquivo("teste.txt", "./turma/gf/elisa/");
			if(sucesso) {
				System.out.println("Arquivo criado com sucesso");
			} else {
				System.out.println("Arquivo não criado com sucesso");
			}
		} else {
			System.out.println("Arquivo já existe, nao sera criado outro");
		}

		
		File f = new File("./turma/gf/elisa/teste.txt");
		ga.escrever(f, "Hi");
		
		
		String texto = ga.capturarTexto(f);
		
		System.out.println(texto);
	}
}
