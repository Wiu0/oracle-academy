
public class TipoForEach {

	public static void main(String[] args) {
		int listaNotas[] = new int[10];
		
		for(int nota : listaNotas) {
			System.out.println(nota);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(listaNotas[i]);
		}
	}
}
