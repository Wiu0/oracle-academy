import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodArea {

	static List<String> nome;
	
	static {
		nome = new ArrayList<>();
	}
	
	public static void buildObjects(int qtd) {
		while(qtd-- > 0) {
			nome.add(new String(qtd + "qtd"));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do{
			MethodArea.buildObjects(i);
			System.out.println("Increase in how many objects in methorArea?");
		}while((i = Integer.parseInt(sc.nextLine())) != -1);
		sc.close();
	}
}
