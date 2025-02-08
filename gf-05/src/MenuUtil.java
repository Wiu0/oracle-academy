
import java.util.Scanner;

import despesa.Despesa;
import imc.ImcFinal;
import tabuada.Tabuada;

/*
 * Essa class faz as seguintes funcoes:	
 System.out.println(1 - IMC
 System.out.println(2 - Tabuada
 System.out.println(3 - Despesas
 System.out.println(4 - Multas
 System.out.println(5 - Calcular areas formas geometricas
 System.out.println(6 - frete
 System.out.println(7 - par ou impar
 System.out.println(8 - pedra, papel e tesoura		 
 */public class MenuUtil {

	static Scanner sc = new Scanner(System.in);
	
	public static void mostrarOpcoesMenu() {
		System.out.println("Escolha uma das opções(Digite o número):");
		System.out.println("1 - IMC");
		System.out.println("2 - Tabuada");
		System.out.println("3 - Despesas");
		System.out.println("4 - Multas");
		System.out.println("5 - Calcular areas formas geometricas");
		System.out.println("6 - Frete");
		System.out.println("7 - Par ou impar");
		System.out.println("8 - Pedra, papel e tesoura");
		System.out.println("0 - Sair");
	}

	public static void main(String[] args) {

		byte opcaoEscolhidaPeloUsuario;
		do {
			mostrarOpcoesMenu();
			opcaoEscolhidaPeloUsuario = sc.nextByte();

			switch (opcaoEscolhidaPeloUsuario) {
			case 1:
				ImcFinal.calcular();
				break;
			case 2:
				Tabuada.calcular();;
				break;
			case 3:
				Despesa.calcular();
				break;
			case 0:
				System.out.println("Encerrando programa");
				break;
			default:
				System.out.println("Opcao invalida: " + opcaoEscolhidaPeloUsuario);
			}
		} while (opcaoEscolhidaPeloUsuario != 0);
		sc.close();
	}
}
