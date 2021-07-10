package elisa;

import java.io.File;
import java.util.Scanner;

public class ProgramaArquivos {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GerenciadorArquivo ga = new GerenciadorArquivo();
		int opcao = 1;
		
		while(opcao != 0) {
			System.out.println("Escolha uma opcao");
			System.out.println("1 - Criar arquivo");
			System.out.println("2 - Escrever arquivo");
			System.out.println("3 - Mostrar conteudo do arquivo");
			System.out.println("0 - Sair");
			
			opcao = Integer.parseInt(sc.nextLine());
			
			switch (opcao) {
			case 1:
				System.out.println("Qual o nome do arquivo");
				String arquivo = sc.nextLine();
				
				System.out.println("Qual o local arquivo");
				String local = sc.nextLine();
				
				ga.criarArquivo(arquivo, local);
				break;
			case 2: 
				System.out.println("Qual o nome do arquivo");
				arquivo = sc.nextLine();
				
				System.out.println("Qual o local arquivo");
				local = sc.nextLine();
				File f = new File(local, arquivo);
				
				
				System.out.println("Escreve o texto a ser guardado no arquivo");
				String texto = sc.nextLine();
				
				ga.escrever(f, texto);
				break;
			
			case 3:
				System.out.println("Qual o nome do arquivo");
				arquivo = sc.nextLine();
				
				System.out.println("Qual o local arquivo");
				local = sc.nextLine();
				f = new File(local, arquivo);
				
				String t = ga.capturarTexto(f);
				System.out.println(t);
				break;

			default:
				System.out.println("Saindo do programa");
				break;
			}
			
		}
		
		sc.close();
		
	}
}
