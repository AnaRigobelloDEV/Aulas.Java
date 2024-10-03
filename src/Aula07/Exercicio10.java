package Aula07;

public class Exercicio10 {

    // Função que calcula o Índice de Massa Corporal (IMC)
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura); // Fórmula do IMC
    }

    public static void main(String[] args) {
        double peso = 70.0; // Peso em kg
        double altura = 1.75; // Altura em metros

        // Chamando a função para calcular o IMC
        double imc = calcularIMC(peso, altura);

        // Exibindo o resultado
        System.out.printf("O IMC é: %.2f%n", imc);
    }
}
