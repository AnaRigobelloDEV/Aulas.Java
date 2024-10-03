package Aula06;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /* Exercício 5: Vetor de Strings
           Armazene 3 nomes em um vetor de Strings. Pergunte ao
           usuário qual nome ele deseja verificar, e exiba se o nome
           está ou não presente no vetor. */

        // Cria um vetor para armazenar 3 nomes
        String[] nomes = new String[3];
        Scanner scanner = new Scanner(System.in);

        // Lê 3 nomes do usuário
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Pergunta ao usuário qual nome deseja verificar
        System.out.print("Digite um nome para verificar: ");
        String nomeBuscado = scanner.nextLine();

        // Verifica se o nome está presente no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }

        // Exibe o resultado
        if (encontrado) {
            System.out.println("O nome '" + nomeBuscado + "' está presente no vetor.");
        } else {
            System.out.println("O nome '" + nomeBuscado + "' não está presente no vetor.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
