import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {
		File f = new File("teste");
		boolean existeAquivo = f.exists();
		System.out.println(existeAquivo);
		
		if(existeAquivo == false) { 
			f.mkdir();
		}
		
		String caminhoArquivo = f.getCanonicalPath();
		System.out.println(caminhoArquivo);
		
		long tamanhoArquivo = f.length();
		System.out.println(tamanhoArquivo);
		
		
		boolean conseguiuDeletar = f.delete();
		System.out.println(conseguiuDeletar);
		
		boolean ehPasta = f.isFile();
		System.out.println(ehPasta);

	}
}
