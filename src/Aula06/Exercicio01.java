package Aula06;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        /* Exercício 1: Soma de Elementos Inteiros em um Vetor
           Crie um programa que armazene 5 números inteiros em um
           vetor. Em seguida, some os elementos e exiba o resultado. */

        // Cria um vetor para armazenar 5 números inteiros
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Lê 5 números inteiros do usuário
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        // Soma os elementos do vetor
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        // Exibe o resultado
        System.out.println("A soma dos números é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}


