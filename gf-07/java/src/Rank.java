import java.util.Scanner;

public class Rank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		if(rank == 1){
			System.out.println("campeao, ganhou carro");
		}
		
		if(rank == 2){
			System.out.println("primeiro perdedor,ganhou moto");
		}
		
		if(rank == 3){
			System.out.println("melhor nem ter participado, ganhou Bike(corrida)");
		}
		sc.close();
	
	}
}

		
		
		
	

