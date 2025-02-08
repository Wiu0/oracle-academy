package ternario;

public class Ternario {

	public static void main(String[] args) {
		int media = 3;

		if (media > 5) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		String valor = media > 5 ? "Aprovado" : "Reprovado";
		System.out.println(valor);

		System.out.println(media > 5 ? "Aprovado" : "Reprovado");

		
//		condicao ? valorRetornoQuandoTrue : valorRetornoQuandoFalse;
//     
//		Dim res As String
//		res = IIF(media > 5, "Reprovado", "Aprovado");
		
	}

}
