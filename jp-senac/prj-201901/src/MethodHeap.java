import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodHeap {

	private List<String> nome;
	
	public MethodHeap() {
		nome = new ArrayList<>();
	}
	
	public void buildObjects(int qtd) {
		while(qtd-- > 0) {
			nome.add(new String("qtd" + qtd));
		}
	}
	
	public static void main(String[] args) {
		MethodHeap obj = new MethodHeap();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do{
			obj.buildObjects(i);
			System.out.println("Increase in how many objects in heap?");
		}while((i = Integer.parseInt(sc.nextLine())) != -1);
		sc.close();
	}
}
