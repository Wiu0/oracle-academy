import java.time.OffsetDateTime;

public class Humano {

	String nome;
	OffsetDateTime horarioExatoNascimento;
	
	public Humano() {
		horarioExatoNascimento = OffsetDateTime.now();
		nome = "SEM NOME";
	}
	
	public void cadastrarDataNascimento(OffsetDateTime data) {
		horarioExatoNascimento = data;
	}
}
