package Aula07;

public class Exercicio09 {

    // Função que calcula a potência de um número
    public static double calcularPotencia(int base, int expoente) {
        return Math.pow(base, expoente); // Utiliza a função pow da classe Math
    }

    public static void main(String[] args) {
        int base = 2; // Base
        int expoente = 3; // Expoente

        // Chamando a função para calcular a potência
        double resultado = calcularPotencia(base, expoente);

        // Exibindo o resultado
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }
}
