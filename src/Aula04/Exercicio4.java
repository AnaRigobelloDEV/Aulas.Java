package Aula04;

import java.util.Scanner;

public class Exercicio4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira um valor e veja quanto ganhará de comissão : ");

            int valor = scanner.nextInt();

            float desconto;

            if (valor < 1000) {
                desconto = valor < 1000 ? (float) 0.05 : 0;
                System.out.println("comissão ganha de 5% no valor  de : " + (valor - valor * desconto));
            }
            if (valor >= 1000 && valor <= 5000) {
                desconto = valor >= 1000 && valor <= 5000 ? (float) 0.10 : 0;
                System.out.println(" comissão ganha de 10% no valor  de : " + (valor - valor * desconto));
            }
            if (valor > 5000) {
                desconto = valor > 5000 ? (float) 0.15 : 0;
                System.out.println("comissão ganha de 15% no valor  de : " + (valor - valor * desconto));
            } else {
                System.out.println("os digitos que voce colocou são indisponiveis");
            }

            scanner.close();
        }
}
