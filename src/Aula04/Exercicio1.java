package Aula04;

import java.util.Scanner;

public class Exercicio1 {
    public class Exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite sua idade : ");

            int idade = scanner.nextInt() ;

            if (idade >= 18) {
                System.out.println("você é de maior e pode acessar");
            }else if (idade >0 && idade <= 18){
                System.out.println("você é menor de idade, procure um parente maior de idade ou responsavel legal");
            }else {
                System.out.println("Não existem idades negativas");
            }

            scanner.close();
        }
}
