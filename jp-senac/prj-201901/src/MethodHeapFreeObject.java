import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodHeapFreeObject {

	public void buildObjects(int qtd) {
		List<Integer> nome= new ArrayList<>();
		while(qtd-- > 0) {
			nome.add(new Integer((int)(Math.random() * Math.random() * 99999)));
		}
	}
	
	public static void main(String[] args) {
		MethodHeapFreeObject obj = new MethodHeapFreeObject();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do{
			obj.buildObjects(i);
			System.out.println("Increase in how many objects in heap?");
		}while((i = Integer.parseInt(sc.nextLine())) != -1);
		sc.close();
	}
}
