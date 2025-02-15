import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        // Definir o conjunto de números	
        int[] numeros = {3, 8, 10, 50, 20, 20, 25, 30};
        // Criar um objeto Random
        Random random = new Random();
        // Gerar um índice aleatório entre 0 e 2 (tamanho do array - 1)
        int indiceAleatorio = random.nextInt(numeros.length);
        // Pegar o número aleatório do conjunto
        int numeroAleatorio = numeros[indiceAleatorio];
        // Imprimir o número aleatório
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}
