import java.io.IOException;

public class AbrirPrograma {

	public static void main(String[] args) {
		try {
			// No Windows
			Runtime.getRuntime().exec("cmd /c start chrome");
			// No macOS (se for necessário)
			// Runtime.getRuntime().exec("open -a 'Google Chrome'");

			// No Linux (se for necessário)
			// Runtime.getRuntime().exec("google-chrome");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
