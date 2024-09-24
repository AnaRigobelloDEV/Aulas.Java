package Aula02;

public class Exercicio6 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;

        boolean comparacao;

        comparacao = num1 == num2;
        System.out.println(num1 + " == " + num2 + " --> " + comparacao);
        comparacao = num1 != num2;
        System.out.println(num1 + " != " + num2 + " --> " + comparacao);
        comparacao = num1 < num2;
        System.out.println(num1 + " < " + num2 + " --> " + comparacao);
        comparacao = num1 > num2;
        System.out.println(num1 + " > " + num2 + " --> " + comparacao);
        comparacao = num1 <= num2;
        System.out.println(num1 + " <= " + num2 + " --> " + comparacao);
        comparacao = num1 >= num2;
        System.out.println(num1 + " >= " + num2 + " --> " + comparacao);
    }
}
