package Aula05;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo
        if (numero < 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            long fatorial = 1; // Variável para armazenar o fatorial
            int i = 1; // Contador

            // Cálculo do fatorial utilizando do-while
            do {
                fatorial *= i; // Multiplica o fatorial pelo contador
                i++; // Incrementa o contador
            } while (i <= numero);

            // Exibe o resultado do fatorial
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close(); // Fecha o scanner
    }
}
