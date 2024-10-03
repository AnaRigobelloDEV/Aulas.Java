package Aula06;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /* Exercício 9: Contando Números Pares em uma Matriz
           Crie uma matriz 4x4 de números inteiros. Conte e exiba
           quantos números pares estão presentes na matriz. */

        // Cria uma matriz 4x4 de inteiros
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com números fornecidos pelo usuário
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Conta quantos números pares estão presentes na matriz
        int contadorPares = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 == 0) { // Verifica se o número é par
                    contadorPares++;
                }
            }
        }

        // Exibe o total de números pares
        System.out.println("A quantidade de números pares na matriz é: " + contadorPares);

        // Fecha o scanner
        scanner.close();
    }
}
