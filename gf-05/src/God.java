import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class God {

	public static void main(String[] args) {
		Humano h0 = new Humano();		
		System.out.println(h0);
		System.out.println(h0.nome);
		System.out.println("Horario Exato: " + h0.horarioExatoNascimento);
		
		Humano h1 = new Humano();
		System.out.println(h1);
		System.out.println(h1.nome);
		System.out.println("Horario Exato: " + h1.horarioExatoNascimento);
		
		Humano h2 = new Humano();
		System.out.println(h2);
		System.out.println(h2.nome);
		System.out.println("Horario Exato: " + h2.horarioExatoNascimento);
		
		
		h2.cadastrarDataNascimento(OffsetDateTime.of(2002, 3, 10, 11, 33, 27, 1001, ZoneOffset.UTC));
		System.out.println(h2.horarioExatoNascimento);
		
		
	}
}
