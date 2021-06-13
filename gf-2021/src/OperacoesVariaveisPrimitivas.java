
public class OperacoesVariaveisPrimitivas {

	public static void main(String[] args) {
		
		//Numeros inteiros
		byte vByte  = 120;
		short vShort = 32000;
		int vInt = 1_000_000;
		long vLong = 2_000_000;
		
		//Numeros ponto flutuante
		float vFloat = 3.1415f;
		double vDouble = 6.12321; 

		System.out.println("Soma");	
		System.out.println(vByte + vShort);
		System.out.println(vByte + vShort + vInt + vLong);
		System.out.println(vByte + vShort + vInt + vLong + vDouble);

		System.out.println("\nSub");
		System.out.println(vByte - vShort);
		System.out.println(vByte - vShort + vInt - vLong);
		System.out.println(vLong - vByte - vShort + vInt - vDouble);


		System.out.println("\nMult");
		System.out.println(vByte * vShort);
		

		System.out.println("\nDiv");
		System.out.println(vShort/vByte);
	
	}

}


