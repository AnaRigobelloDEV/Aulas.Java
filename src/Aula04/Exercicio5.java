package Aula04;

import java.util.Scanner;

public class Exercicio5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira a quantidade de horas trabalhadas : ");

            float horas = scanner.nextFloat();

            float extra;

            extra = horas > 40 ? (float) 0.5 : 0;

            System.out.println(" com horas extras, no total deu : " + (horas + horas * extra));

            scanner.close();
        }
}
