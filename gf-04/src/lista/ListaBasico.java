package lista;

import java.util.Scanner;

public class ListaBasico {

	public static void main(String[] args) {
		
		int qtdPessoas = 0;
		String nomes[] = new String[2];

		System.out.println("Sistema de saude\n===================");
		Scanner sc = new Scanner(System.in);
		int opcao = -1;
		
		do {

			System.out.println("0-Encerrar\n1-Cadastrar Pessoa\n2-Listar pessoas cadastradas");
			opcao = Integer.parseInt(sc.nextLine());
			
			switch (opcao) {
			case 1:
				
				if(qtdPessoas == 2) {
					nomes = new String[4];
				}

				System.out.println("Informe o nome da pessoa:");
				// Guardar nome
				nomes[qtdPessoas] = sc.nextLine();
				qtdPessoas = qtdPessoas + 1;
				System.out.println("Cadastro com sucesso, ir para medicacao");				
				break;
			case 2:
				System.out.println("Lista de pessoas medicadas:");
				for(int i = 0; i < 2; i++) {
					System.out.println(nomes[i]);
				}
				break;
			case 0:
				System.out.println("Encerrando o programa");
				break;

			default:
				System.out.println("Opcao invalida. " + opcao);
				break;
			}

		} while (opcao != 0);
		sc.close();
//		
//		int qtdPessoas = 10;
//		String nomes[] = new String[qtdPessoas];
//		
//		for(int i = 0; i < qtdPessoas; i++) {
//			nomes[i] = "Pessoa " + i;
//		}
//			
//		
//		for(int i = 0; i < qtdPessoas; i++) {
//			System.out.println(nomes[i]);
//		}

	}
}
