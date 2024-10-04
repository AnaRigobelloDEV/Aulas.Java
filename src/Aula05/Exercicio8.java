package Aula05;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePares = 0; // Contador de números pares
        int quantidadeImpares = 0; // Contador de números ímpares
        int quantidadeNumeros = 10; // Total de números a serem lidos

        // Laço for para ler os 10 números
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt(); // Lê o número

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                quantidadePares++; // Incrementa o contador de pares
            } else {
                quantidadeImpares++; // Incrementa o contador de ímpares
            }
        }

        // Exibe a quantidade de números pares e ímpares
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        scanner.close(); // Fecha o scanner
    }
}
