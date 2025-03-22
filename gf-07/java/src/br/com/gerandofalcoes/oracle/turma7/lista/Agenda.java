package br.com.gerandofalcoes.oracle.turma7.lista;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		String numeroTelefone[] = new String[10];
		int posicaoCadastrado = 0;
		do {
			System.out.println("1. Cadastrar numero de telefone");
			System.out.println("2. Consultar numero de telefone");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite seu numero de telefone a ser cadastrado");
				sc.nextLine();
				numeroTelefone[posicaoCadastrado++] = sc.nextLine();
				break;
			case 2:
				System.out.println("Digite seu numero de telefone a ser consultado");
				sc.nextLine();
				String phoneNumber = sc.nextLine();
				boolean numeroEncontrado = false;

				for (int i = 0; i < 10; i++) {
					if (phoneNumber.equals(numeroTelefone[i])) {
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
