package Aula05;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble(); // Lê a nota informada

            // Verifica se a nota está fora do intervalo
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }

        } while (nota < 0 || nota > 10); // Continua pedindo até que a nota seja válida

        // Exibe a nota válida
        System.out.println("Nota válida: " + nota);

        scanner.close(); // Fecha o scanner
    }
}
