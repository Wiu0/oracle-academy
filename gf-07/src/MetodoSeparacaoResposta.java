
public class MetodoSeparacaoResposta {

    public static void main(String[] args) {
        double salario = 5000.00;
        double aumento = 0.10;
        double desconto = 0.05;
        
        double valorAumento = calcularAumento(salario, aumento);
        double salarioComAumento = calcularSalarioComAumento(salario, valorAumento);
        double valorDesconto = calcularDesconto(salarioComAumento, desconto);
        double salarioFinal = calcularSalarioFinal(salarioComAumento, valorDesconto);
        exibirResultados(salario, valorAumento, salarioComAumento, valorDesconto, salarioFinal);
        
    }

    // Método para calcular o aumento
    public static double calcularAumento(double salario, double aumento) {
        return salario * aumento;
    }

    // Método para calcular o salário com aumento
    public static double calcularSalarioComAumento(double salario, double valorAumento) {
        return salario + valorAumento;
    }

    // Método para calcular o desconto
    public static double calcularDesconto(double salarioComAumento, double desconto) {
        return salarioComAumento * desconto;
    }

    // Método para calcular o salário final após o desconto
    public static double calcularSalarioFinal(double salarioComAumento, double valorDesconto) {
        return salarioComAumento - valorDesconto;
    }

    // Método para exibir os resultados
    public static void exibirResultados(double salario, double valorAumento, double salarioComAumento, double valorDesconto, double salarioFinal) {
        System.out.println("Salário original: " + salario);
        System.out.println("Aumento: " + valorAumento);
        System.out.println("Salário com aumento: " + salarioComAumento);
        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Salário final após desconto: " + salarioFinal);
    }
}
