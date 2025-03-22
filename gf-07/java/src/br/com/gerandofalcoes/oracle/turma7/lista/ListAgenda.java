package br.com.gerandofalcoes.oracle.turma7.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAgenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		List<String> numeroTelefone = new ArrayList<String>();
		
		int posicaoCadastrado = 0;
		do {
			System.out.println("1. Cadastrar numero de telefone");
			System.out.println("2. Consultar numero de telefone");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite seu numero de telefone a ser cadastrado");
				sc.nextLine();
				numeroTelefone.add(sc.nextLine()) ;
				break;
			case 2:
				System.out.println("Digite seu numero de telefone a ser consultado");
				sc.nextLine();
				String phoneNumber = sc.nextLine();
				boolean numeroEncontrado = false;

				for (int i = 0; i < numeroTelefone.size(); i++) {
					if (phoneNumber.equals(numeroTelefone.get(i))) {
						numeroEncontrado = true;
						break;
					}
				}
				if (numeroEncontrado) {
					System.out.println("Numero ja cadastrado");
				} else {
					System.out.println("Numero nao cadastrado");
				}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		} while (opcao != 0);
		sc.close();
	}
}
