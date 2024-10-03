package Aula06;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        /* Exercício 10: Maior Elemento de uma Matriz
           Crie uma matriz 3x3 de números inteiros. Encontre e exiba
           o maior valor armazenado nessa matriz. */

        // Cria uma matriz 3x3 de inteiros
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com números fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Encontra o maior valor na matriz
        int maiorValor = matriz[0][0]; // Inicializa com o primeiro elemento
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j]; // Atualiza o maior valor
                }
            }
        }

        // Exibe o maior valor encontrado
        System.out.println("O maior valor na matriz é: " + maiorValor);

        // Fecha o scanner
        scanner.close();
    }
}
