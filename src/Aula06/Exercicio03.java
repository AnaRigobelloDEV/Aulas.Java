package Aula06;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /* Exercício 3: Contagem de Valores Booleanos
           Crie um vetor de 8 posições booleanas, onde o usuário pode
           inserir true ou false. Conte quantos valores true foram
           inseridos. */

        // Cria um vetor para armazenar 8 valores booleanos
        boolean[] valores = new boolean[8];
        Scanner scanner = new Scanner(System.in);

        // Lê 8 valores booleanos do usuário
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor (true/false): ");
            valores[i] = scanner.nextBoolean();
        }

        // Conta quantos valores true foram inseridos
        int contadorTrue = 0;
        for (boolean valor : valores) {
            if (valor) {
                contadorTrue++;
            }
        }

        // Exibe o resultado
        System.out.println("Quantidade de valores true: " + contadorTrue);

        // Fecha o scanner
        scanner.close();
    }
}
