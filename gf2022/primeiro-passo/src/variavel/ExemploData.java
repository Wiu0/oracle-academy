package variavel;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class ExemploData {

	public static void main(String[] args) {
		OffsetDateTime dataNascimento = OffsetDateTime.of(2000, 1, 2, 3, 12, 34, 10, ZoneOffset.UTC);
		System.out.println(dataNascimento);

		String horarioFesta = "01/02/2000 2PM-03:00";
		System.out.println(horarioFesta);

		String momentoChegada = "01/03/2000 15:00:01:234";
		System.out.println(momentoChegada);

		OffsetDateTime dataHoraAtual = OffsetDateTime.now();
		int horaExata = dataHoraAtual.get(ChronoField.HOUR_OF_DAY);

		System.out.println("A hora atual é: " + horaExata);

		if (horaExata > 0 && horaExata < 6) {
			System.out.println("Boa Madrugada");
		} else if (horaExata >= 6 && horaExata < 12) {
			System.out.println("Bom dia");
		} else if (horaExata >= 12 && horaExata < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

	}
}
