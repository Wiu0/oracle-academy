
public class Foguete {

	
	public static void main(String[] args) {
		//for
		//while
		//do while
		//recursiva
	
		//for => para
		//Repetir 10 vezes

		print(0);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Fui");
		}
		System.out.println("Fim do for");
		
		for(long i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Lancar");
		
		
		int i = 0;
		while(i < 10) {
			System.out.println("Condicao verdadeira fazer novamente");
			i++;
		}
		
		int j = 10;
		while(j > 0) {
			System.out.println("Condicao verdadeira fazer novamente " + j);
			j--;
		}
		
	}
	
	
	static void print(int qtdVezesExecutada) {
		if(qtdVezesExecutada == 10) {
			return;
		}
		int v= qtdVezesExecutada+ 1;
		System.out.println("OI " + v);
		print(v);
		
	}
	
}
