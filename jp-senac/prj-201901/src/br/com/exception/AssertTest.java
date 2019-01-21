package br.com.exception;

/*
 * Caso seu assert não funcione, você deve ativá-lo. Uma das formas de ativar é pelo Eclipse seguindo os passos abaixo, assim toda vez que você executar qualquer projeto, já estará ativo os assert.
	Abra o Eclipse e vá em Window->Preferences.
	Vá até Java -> Installed JREs. Você deve selecionar o JRE que você utiliza e clicar em Editar (Edit).
	Escolhendo a JRE
	Digite “-ea” no campo “Default VM arguments”, que significa Enable Assertions.
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
