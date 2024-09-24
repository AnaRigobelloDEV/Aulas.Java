package Aula04;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota do aluno : ");

        int nota = scanner.nextInt();

        if (nota > 7) {
            System.out.println("o aluno esta aprovado");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println(" esse aluno esta em recuperacao");
        }else if (nota < 5 && nota >= 0) {
            System.out.println("o aluno esta reprovado");
        }else {
            System.out.println("nao existe tamanha nota para a prova ");
        }

        scanner.close();
    }
}
