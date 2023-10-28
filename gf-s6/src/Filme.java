import java.math.BigDecimal;
import java.util.Scanner;

public class Filme {

	public static void main(String[] args) {
		
		String nome;
		
		byte faixaEtaria; //0 - L, 10, 12, 16, 18
		short duracao; //minutos 32k 
		int quantidadeCompartilhamento;
		long quantidadeVisualizacao;
		float valorCustoDoFilme;
		double valorDaBilheteria;
		char seloQualidade;
		boolean disponivel;
		
		String[] nomeAtores;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do filme:");
		nome = sc.nextLine();
		System.out.println("Informe a faixa etaria do filme:");
		faixaEtaria = sc.nextByte();
		System.out.println("Informe a duração do filme:");
		duracao = sc.nextShort();
		System.out.println("Informe quantidade compartilhamento do filme:");
		quantidadeCompartilhamento = sc.nextInt();
		System.out.println("Informe quantidade visualização do filme:");
		quantidadeVisualizacao = sc.nextLong();
		System.out.println("Informe o custo do filme filme:");
		valorCustoDoFilme = sc.nextFloat();
		System.out.println("Informe o valor da bilheteria do filme:");
		valorDaBilheteria = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe o selo de qualidadedo filme:");
		seloQualidade = sc.nextLine().charAt(0);
		System.out.println("Informe se ja está disponivel o filme:");
		disponivel = sc.nextBoolean();
		
		sc.close();
		
		System.out.println("Cadastrado com sucesso: ");
		System.out.println("Nome: " + nome);
		System.out.println("Disponível: " + disponivel);
		System.out.println("Bilheteria: " + valorDaBilheteria);
		
		
	}
}
