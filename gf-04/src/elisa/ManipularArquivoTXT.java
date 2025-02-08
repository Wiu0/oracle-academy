package elisa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManipularArquivoTXT {
	
	public static void main(String[] args) throws IOException {
		criarArquivo();
	}
	
	static void criarArquivo() {
		try {
			File dir = new File("C:\\Users\\Laercio\\Documents\\Estudos\\Programacao");
			File arq = new File(dir, "nomeDesafios.txt");
			boolean statusArq = arq.createNewFile();
			System.out.println("status: " + statusArq);
			escrever(arq);
			mostrarTexto(arq);

		} catch (IOException e) {
			e.printStackTrace(); 
		}


	}

	static void escrever(File arq) throws IOException {
		Scanner sc = new Scanner(System.in);

		if (arq.exists()) {
			FileWriter fw = new FileWriter(arq, true);
			PrintWriter pw = new PrintWriter(fw);
			System.out.println("Insira um nome: ");
			pw.append(sc.next()+ "\r\n");
			pw.flush();
			sc.close();
			pw.close();
			fw.close();
		}
	}

	static void mostrarTexto(File arq){
		try {
			java.io.FileReader fr = new java.io.FileReader(arq);
			BufferedReader br = new BufferedReader(fr);

			String linha = "";
			while ( ( linha = br.readLine() ) != null) {
				System.out.println(linha);
			}
			fr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}