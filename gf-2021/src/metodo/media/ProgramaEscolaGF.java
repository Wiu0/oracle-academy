package metodo.media;

import java.util.Scanner;

public class ProgramaEscolaGF {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1Aluno, nota2Aluno, nota3Aluno, mediaAluno;
	    String nomeAluno;
	    
	    System.out.println("Qual seu nome?");
	    nomeAluno = sc.next();
	    System.out.println("Qual sua nota 1?");
	    nota1Aluno = sc.nextDouble();
	    System.out.println("Qual sua nota 2?");
	    nota2Aluno = sc.nextDouble();
	    System.out.println("Qual sua nota 3?");
	    nota3Aluno = sc.nextDouble();
	    sc.close();
	    
	    mediaAluno = (nota1Aluno + nota2Aluno + nota3Aluno)/3;
	    System.out.println(nomeAluno + ", vc tirou " +  mediaAluno);
	
	}
	
}
