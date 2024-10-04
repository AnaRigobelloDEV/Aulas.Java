package Aula05;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0; // Variável para armazenar a soma das notas
        int quantidadeNotas = 5; // Total de notas a serem recebidas

        // Laço for para receber as notas
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble(); // Lê a nota
            soma += nota; // Adiciona a nota à soma
        }

        // Cálculo da média
        double media = soma / quantidadeNotas;

        // Exibe a média calculada
        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close(); // Fecha o scanner
    }
}
