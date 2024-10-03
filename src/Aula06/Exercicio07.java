package Aula06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /* Exercício 7: Soma de Valores em uma Matriz
           Crie uma matriz 3x3 e peça ao usuário para preencher com
           números inteiros. Em seguida, some todos os valores da matriz
           e exiba o total. */

        // Cria uma matriz 3x3
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com números fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Soma todos os valores da matriz
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        // Exibe o total
        System.out.println("A soma de todos os valores da matriz é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}
