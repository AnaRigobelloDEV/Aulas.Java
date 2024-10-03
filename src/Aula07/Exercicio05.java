package Aula07;

public class Exercicio05 {

    // Função que calcula a média de três notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        double nota1 = 7.5; // Primeira nota
        double nota2 = 8.0; // Segunda nota
        double nota3 = 9.0; // Terceira nota

        // Chamando a função para calcular a média
        double media = calcularMedia(nota1, nota2, nota3);

        // Exibindo o resultado da média
        System.out.printf("A média das notas %.2f, %.2f e %.2f é: %.2f%n", nota1, nota2, nota3, media);
    }
}

