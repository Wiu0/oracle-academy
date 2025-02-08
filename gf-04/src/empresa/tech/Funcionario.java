package empresa.tech;

import java.util.Date;

public class Funcionario {

	String nome;
	double salario;
	String endereco;
	Date dataNascimento;
	double bonus;
	Setor setor;
	
	
	public double retornarGanhos() {
		double totalGanho = salario + bonus;
		return totalGanho;
	}
	
	public int calcularIdade() {
		int idade = 0;
		
		return idade;
	}
	
	public void complementarEndereco(String complemento) {
		endereco = endereco + complemento;
	}
	
}
