package converter;

public class ConversorIdade {
	
	
	public static void main(String[] args) {
		String idade = "19";
		String idadeDecimal = "20.4";
		
		System.out.println("Idade inteira:" + idade);
		System.out.println("Idade decimal:" + idadeDecimal);
	
	   String anoNascimento = 2021 + idade; //=> "202119"
	   System.out.println(anoNascimento);
	   
	   //=> Erro
	   //int anoNascimentoNumerico = 2021 + idade; 
	   //System.out.println(anoNascimento);
	   
	   //Qual tipo numerico? byte => Byte, short => Short, int => Integer, long => Long
	   int idadeNumerica = Integer.parseInt(idade);
	   System.out.println(2021 - idadeNumerica);
	}

}
