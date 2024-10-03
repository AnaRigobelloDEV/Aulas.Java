package Aula06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /* Exercício 6: Preenchendo uma Matriz
           Crie uma matriz 2x2 de inteiros. Preencha a matriz com
           números fornecidos pelo usuário e exiba os valores inseridos. */

        // Cria uma matriz 2x2
        int[][] matriz = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com números fornecidos pelo usuário
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibe os valores inseridos na matriz
        System.out.println("Os valores inseridos na matriz são:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha para cada linha da matriz
        }

        // Fecha o scanner
        scanner.close();
    }
}
