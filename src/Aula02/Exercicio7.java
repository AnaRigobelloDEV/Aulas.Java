package Aula02;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        System.out.println("condição (1) and condição (2) and condição (3) = " + (cond1 && cond2 && cond3));
        System.out.println("condição (1) and condição (2) or condição (3) = " + (cond1 && cond2 || cond3));
        System.out.println("condição (1) or condição (2) and condição (3) = " + (cond1 || cond2 && cond3));
        System.out.println("condição (1) or condição (2) or  condição (3) = " + (cond1 || cond2 || cond3));
        System.out.println("condição 1 = " + (cond1) + "condição 2 = " + (cond2) + "condição 3 = " + (cond3) + (cond1 || cond2 || cond3));

    }
}
