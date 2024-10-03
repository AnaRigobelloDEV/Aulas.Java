package Aula04;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Opção 1 - Eletrônicos \n Opção 2 - Alimentos \n Opção 3 - Vestuários. \n Escolha umas das opções : ");

        int produto = scanner.nextInt();

        switch (produto) {
            case 1:
                System.out.println("direcionando para a categoria de eletronicos : ");
                break;
            case 2:
                System.out.println("direcionando para a categoria de alimentos : ");
                break;
            case 3:
                System.out.println("direcionando para categoria de vestuários : ");
                break;
            default:
                System.out.println("não possui outra categorias alem dessas 3. ");
        }

        scanner.close();
    }
}
