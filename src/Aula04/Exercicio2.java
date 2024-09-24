package Aula04;

import java.util.Scanner;

public class Exercicio2 {
    public class Exercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite seu preço : ");

            float preco = scanner.nextFloat();

            float desconto;

            desconto = preco > 100 ? (float) 0.10 : 0;

            System.out.println("valor com desconto de = " + (preco - preco * desconto));

            scanner.close();
        }
}
