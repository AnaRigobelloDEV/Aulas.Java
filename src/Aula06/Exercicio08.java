package Aula06;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /* Exercício 8: Matriz de Números Reais (double)
           Crie uma matriz 2x2 de números reais (double). Preencha a
           matriz com valores fornecidos pelo usuário, e depois exiba
           a soma dos valores de cada linha. */

        // Cria uma matriz 2x2 de double
        double[][] matriz = new double[2][2];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Exibe a soma dos valores de cada linha
        for (int i = 0; i < 2; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 2; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("A soma dos valores da linha " + (i + 1) + " é: " + somaLinha);
        }

        // Fecha o scanner
        scanner.close();
    }
}
