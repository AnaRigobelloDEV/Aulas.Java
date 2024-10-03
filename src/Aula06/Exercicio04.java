package Aula06;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /* Exercício 4: Média de Notas
           Leia 4 notas (valores decimais) e armazene-as em um vetor.
           Calcule e exiba a média dessas notas. */

        // Cria um vetor para armazenar 4 notas
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);

        // Lê 4 notas do usuário
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        // Exibe a média
        System.out.println("A média das notas é: " + media);

        // Fecha o scanner
        scanner.close();
    }
}
