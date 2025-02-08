package desafio.facil;

public class Peca {

	String nome;
	char posicaoAtualLetra; 
	byte posicaoAtualNumero; 
		
	public void validarMovimento(char posicaoDesejaLetra, byte posicaoDesejaNumero) {
		System.out.println("pL:" + posicaoDesejaLetra + "\npN:" + posicaoDesejaNumero);
		
		switch (nome) {
		case "torre":
			if(posicaoAtualLetra != posicaoDesejaLetra && posicaoAtualNumero != posicaoDesejaNumero) {
				System.out.println("Movimento invalido");
			} else {
				System.out.println("Movimento valido");
			}
			break;
		case "bispo":
			int deslocamento = posicaoAtualNumero - posicaoDesejaNumero;
			char letraDestinoPossivel1 = (char) (posicaoAtualLetra + deslocamento);
			char letraDestinoPossivel2 = (char) (posicaoAtualLetra - deslocamento);
			if(letraDestinoPossivel1 == posicaoDesejaLetra ||  letraDestinoPossivel2 == posicaoDesejaLetra) {
				System.out.println("Movimento Valido");	
			} else {
				System.out.println("Movimento Invalido");
			}
			break;
		default:
			System.out.println("peça invalida");
			break;
		}
	}
	
}
