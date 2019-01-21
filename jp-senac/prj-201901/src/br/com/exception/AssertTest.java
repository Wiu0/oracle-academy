package br.com.exception;

/*
 * Caso seu assert n�o funcione, voc� deve ativ�-lo. Uma das formas de ativar � pelo Eclipse seguindo os passos abaixo, assim toda vez que voc� executar qualquer projeto, j� estar� ativo os assert.
	Abra o Eclipse e v� em Window->Preferences.
	V� at� Java -> Installed JREs. Voc� deve selecionar o JRE que voc� utiliza e clicar em Editar (Edit).
	Escolhendo a JRE
	Digite �-ea� no campo �Default VM arguments�, que significa Enable Assertions.
 */
public class AssertTest {

	public static void main(String[] args) {
		int celsius = getTempUser();

		assert(celsius > 0) : "Freezing point";
		assert(celsius < 100);//Boinlig
//		assert(getTempUser() > 0);

	}

	private static int getTempUser() {
		return 45;
	}
}
