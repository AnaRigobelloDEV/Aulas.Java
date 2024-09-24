package Aula05;

import java.util.Scanner;

public class Exemplos{
    public static void main(String[] args) {
        int idade = 15;

        while (idade < 18){
            System.out.println(idade);
            idade = idade + 1;
        }
    }
}
//ex2

public static void main(String[] args) {
    String nome = "Daniel", nomeDigitado;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome : ");
    nomeDigitado = scanner.nextLine();
// o simbolo "!" indica diferença //
    while (!nome.equals(nomeDigitado)){
        System.out.println("Nome errado, digite novamente analfabeto: ");
        nomeDigitado = scanner.nextLine();
    }
    System.out.println("Parabéns, você não é tão burro. ");

    scanner.close();
}

//ex3

public static void main(String[] args) {
    int contador = 10;
    // do while ;  //
    do {
        System.out.println(contador);
        contador++;
    }while (contador < 20);
}

//ex4

public static void main(String[] args) {
    String nome = "Daniel", nomeDigitado;
    Scanner scanner = new Scanner(System.in);
    // do while - fez com que //
    do {
        System.out.println("Digite seu nome: ");
        nomeDigitado = scanner.nextLine();
    }while (!nome.equals(nomeDigitado));
    System.out.println("Parabéns , esse é o seu nome. ");

    scanner.close();
}

//ex5

public static void main(String[] args) {
    //for : escopo - abrangencia , limite que posso usar ; //
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }

}

//ex6

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int par = 0, impar = 0, numero=0;
    for (int i = 1; i <= 10; i++) {
        System.out.println(" digite o "+ i + " ° número");
        numero =  scanner.nextInt();
        if(numero % 2 == 0){
            par++;
        }else {
            impar++;
        }
    }
    System.out.println(" você digitou "+ par + " pares e " + impar + " impares. ");
}

//ex7

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero = 0;


    for (int i = 0; i < 10; i++) {
        System.out.println("Digite o " + i + " ° número: ");
        numero = scanner.nextInt();
        if (numero == i) {
            System.out.println("S eu número está localizado na " + i + " ° posição.");
        }else {
            System.out.println("seu número nao foi encontrado.");
        }
    }
}