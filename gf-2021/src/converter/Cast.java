package converter;

public class Cast {

	public static void main(String[] args) {
//		byte < short < int < long
		
		byte bbb = -23;
		long aaa = bbb;  
		
		short s = 45;
		byte te = (byte)s;
		
		
		int valor = -2336;
		//-9 ate 20
//==================================
// -128, -127, -126, -125 ... -3, -2, -1, 0, 1, 2, 3, 4 ... 127 				
		byte idade = (byte)valor;
		System.out.println(idade);
		
		
		
//		long distancia = valor;
//		System.out.println(distancia);
		
	}
}
