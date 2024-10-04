package Aula05;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo
        if (numero <= 1) {
            System.out.println("Por favor, digite um número inteiro positivo maior que 1.");
        } else {
            boolean isPrimo = true; // Suponha que o número é primo

            // Verificação de número primo utilizando laço for
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false; // Se for divisível, não é primo
                    break; // Sai do laço
                }
            }

            // Exibe o resultado
            if (isPrimo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        scanner.close(); // Fecha o scanner
    }
}
