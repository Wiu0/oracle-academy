package elisa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GerenciadorArquivo {

	
	boolean existeArquivo(String nomeArquivo, String local) {
		File arq = new File(local, nomeArquivo);
		return arq.exists();
	}
	
	boolean criarArquivo(String nomeArquivo, String local) {
		try {
			File dir = new File(local);
			File arq = new File(dir, nomeArquivo);
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			boolean statusArq =	 arq.createNewFile();				
			return statusArq;
		} catch (IOException e) {
			e.printStackTrace(); 
			return false;
		}
	}
	
	
	void escrever(File arq, String textoASerEscrito) {
		try {			
			if (arq.exists()) {
				FileWriter fw = new FileWriter(arq, true);
				PrintWriter pw = new PrintWriter(fw);
				pw.append(textoASerEscrito + "\r\n");
				pw.flush();
				pw.close();
				fw.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	String capturarTexto(File arq){
		try {
			String textoNoArquivo = "";
			Scanner sc = new Scanner(arq);
			while(sc.hasNextLine()) {
				textoNoArquivo = textoNoArquivo + sc.nextLine() + "\n";
			}
			sc.close();
			return textoNoArquivo;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		
		
	}
}
