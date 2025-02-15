import java.util.Scanner;

public class CalculadoraData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIA ATUAL");
		System.out.println("Dia:");
		int dia = sc.nextInt();
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("Ano:");
		int ano = sc.nextInt();
		System.out.println("=================================");
		System.out.println("Periodo");
		System.out.println("ANOS:");
		int anoFato = sc.nextInt();
		System.out.println("MESES:");
		int mesFato = sc.nextInt();
		System.out.println("DIAS:");
		int diaFato = sc.nextInt();
		System.out.println("=================================");
		System.out.println("Muito bom, então sendo hoje " + dia + "/" + mes + "/"  + ano + " e o fato aconteceu há "
				+ anoFato + " anos " + mesFato 
				+ " meses e " + diaFato + " dias... Calculando");
		int anoOrigem = ano - anoFato;
		int mesOrigem = mes - mesFato;
		int diaOrigem = dia - diaFato;
		System.out.println("O fato aconteceu na ano " + anoOrigem);
		System.out.println("O fato aconteceu na mes " + mesOrigem);
		System.out.println("O fato aconteceu na dia " + diaOrigem);
		sc.close();
	}
}
