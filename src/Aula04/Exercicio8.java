package Aula04;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De 1 a 5 , que nota você daria para esse funcionário ? ");

        int avaliacao = scanner.nextInt();

        switch (avaliacao) {

            case 1 :
                System.out.println("Precisa melhorar. ");
                break;
            case 2 :
                System.out.println("Abaixo da média. ");
                break;
            case 3 :
                System.out.println("Média. ");
                break;
            case 4 :
                System.out.println("Acima da média. ");
                break;
            case 5 :
                System.out.println("Excelente!!!");
                break;
            default:
                System.out.println("Não possui outras avaliações além dessas 5. ");
        }

        scanner.close();
    }
}
