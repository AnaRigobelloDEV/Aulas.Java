package Aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>(); // Lista para armazenar números pares
        List<Integer> impares = new ArrayList<>(); // Lista para armazenar números ímpares

        while (true) {
            System.out.print("Digite um número inteiro (ou um número negativo para sair): ");
            int numero = scanner.nextInt(); // Lê o número fornecido pelo usuário

            // Verifica se o número é negativo para encerrar
            if (numero < 0) {
                break; // Interrompe a leitura
            }

            // Verifica se o número é maior que 100
            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada.");
                break; // Interrompe a leitura
            }

            // Verifica se o número é par ou ímpar e armazena na lista correspondente
            if (numero % 2 == 0) {
                pares.add(numero); // Adiciona à lista de pares
            } else {
                impares.add(numero); // Adiciona à lista de ímpares
            }
        }

        // Exibe os resultados
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        scanner.close(); // Fecha o scanner
    }
}
