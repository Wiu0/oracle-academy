package empresa.tech;

import java.util.Calendar;

public class TelaFuncionario {

	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Ana";
		funcionario.salario = 3000.01;
		funcionario.bonus = 101.02;
		funcionario.dataNascimento = Calendar.getInstance().getTime();
		funcionario.endereco = "RUA 1";
		
		Setor setorFuncionario = new Setor();
		setorFuncionario.id = 1;
		setorFuncionario.nome = "TI";
		setorFuncionario.andar = "23";
		
		funcionario.setor = setorFuncionario;
		
		System.out.println(funcionario.nome + " vai receber " + funcionario.retornarGanhos() + " e ela é do setor de " + funcionario.setor.nome);
	}
}
