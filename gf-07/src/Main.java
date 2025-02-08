
import java.io.File;
import java.io.FileWriter; // escritor
import java.io.IOException; // "ignora" o exception para evitar erros
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException { // classe para permitir o fileWriter

		Scanner numero = new Scanner(System.in);
		Scanner texto = new Scanner(System.in);

		int opcao;
		String caminho;
		String nomeArquivo;
		
		do {
			System.out.println("""
					Qual opção você deseja realizar:
					[1] Escrever no arquivo
					[2] Ler o arquivo
					[3] Apagar os dados do arquivo
					[4] Tecla para finalizar
					""");
			opcao = numero.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o caminho do arquivo:");
				caminho = texto.nextLine();
				System.out.println("Digite o nome do arquivo:");
				nomeArquivo = texto.nextLine();
				
				File f = new File(caminho);
				if(!f.exists()) {
					System.out.println("Arquivo nao existe, criando");
					f.mkdirs();
				}
				f = new File(caminho + "/" + nomeArquivo);
				if(!f.exists()) {
					f.createNewFile();
				}
				
				FileWriter escritor = new FileWriter(f, true);
				// FileWriter importa um arquivo de texto - pdf não
				// o true verifica se o arquivo existe, se sim, escreve no fim do que já está
				// escrito
				System.out.println(" ");
				System.out.println("O que você deseja escrever? ");
				String conteudo = " " + texto.nextLine();
				escritor.write(conteudo); // escreve no arquivo a partir do que foi armazenado
				escritor.close();
				break;
			case 2:
				System.out.println("Digite o caminho do arquivo: (path + nome do arquivo)");
				caminho = texto.nextLine();
				Scanner sc = new Scanner(new File(caminho));
				System.out.println(" ");
				while (sc.hasNextLine()) { // enquanto tiver prox linha
					System.out.println(sc.nextLine());
				}
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				break;
			case 3:
				System.out.println("Digite o caminho do arquivo: (path + nome do arquivo)");
				caminho = texto.nextLine();
				FileWriter escritor1 = new FileWriter(caminho); // false opicional
				escritor1.close();
				break;
			case 4:
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção invalida.");
				break;
			}

		} while (opcao != 4);

		numero.close();
		texto.close();

	}

}