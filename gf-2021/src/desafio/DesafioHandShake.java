package desafio;

public class DesafioHandShake {
	
	public static void main(String[] args) {
		
		int resultado = handshake(7);
		System.out.println(resultado);
		
	}
	
	 static int handshake(int n) {
		 int totalHandShake = 0;
		 //loop
		 for(int i = n - 1; i > 0; i--) {
			 totalHandShake = totalHandShake + i;
		 }
		 
		return totalHandShake;

   }

}
