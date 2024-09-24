package Aula04;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Escolha um número : ");

        int num1 = scanner.nextInt();

        System.out.println(num1);

        System.out.print("\nEscolha outro número : ");

        int num2 = scanner.nextInt();

        System.out.println(num2);

        System.out.println("1 - soma ");
        System.out.println("2 - subtracao ");
        System.out.println("3 - multiplicacao");
        System.out.println("4 - divisao ");

        System.out.print("\nescolha uma operação : ");

        int operacao = scanner.nextInt();


        switch (operacao) {
            case 1 :
                operacao = num1 + num2;
                System.out.println(num1 + "+" + num2 + "= " + operacao);
                break;
            case 2 :
                operacao = num1 - num2;
                System.out.println(num1 + "-" + num2 + "= " + operacao);
                break;
            case 3 :
                operacao = num1 * num2;
                System.out.println(num1 + "x" + num2 + "= " + operacao);
                break;
            case 4 :
                operacao = num1 / num2;
                System.out.println(num1 + "/" + num2 + "= " + operacao);
                break;
            default:
                System.out.println("nao existem outras operacoes alem dessas ");
        }

        scanner.close();
    }
}
}
