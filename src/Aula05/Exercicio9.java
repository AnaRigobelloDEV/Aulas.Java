package Aula05;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Random random = new Random(); // Cria um objeto Random
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int palpite;
        int tentativas = 0; // Contador de tentativas

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        do {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            palpite = scanner.nextInt(); // Lê o palpite do usuário
            tentativas++; // Incrementa o contador de tentativas

            // Verifica se o palpite é menor, maior ou igual ao número aleatório
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }

        } while (palpite != numeroAleatorio); // Continua até o usuário acertar o número

        // Exibe o número de tentativas feitas
        System.out.println("Número de tentativas: " + tentativas);

        scanner.close(); // Fecha o scanner
    }
}
