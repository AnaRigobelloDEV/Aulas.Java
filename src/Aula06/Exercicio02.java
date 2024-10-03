package Aula06;

import java.util.Scanner; // Importando a classe Scanner

public class Exercicio02 {

    public static void main(String[] args) {

        /* Exercício 2: Busca de Caracteres em um Vetor
           Armazene 6 caracteres em um vetor de Strings. Pergunte ao
           usuário uma letra e informe se ela está presente no vetor e em
           qual posição do vetor */

        // Cria um vetor para armazenar 6 caracteres
        String[] caracteres = new String[6];
        Scanner scanner = new Scanner(System.in);

        // Lê 6 caracteres do usuário
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            caracteres[i] = scanner.next();
        }

        // Pergunta ao usuário por uma letra
        System.out.print("Digite uma letra para buscar: ");
        String letraBuscada = scanner.next();

        // Verifica se a letra está presente no vetor
        boolean encontrado = false;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i].equalsIgnoreCase(letraBuscada)) {
                System.out.println("A letra '" + letraBuscada + "' está presente na posição " + i + ".");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("A letra '" + letraBuscada + "' não está presente no vetor.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
