package Aula07;

public class Exercicio02 {

     /*Exercício 2: Função que Soma Dois Números
Crie uma função chamada somar que receba dois números
inteiros como parâmetros e retorne a soma deles. Exiba o
resultado no métod0 main.*/

    // Função que soma dois números inteiros e retorna o resultado
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int a = 5; // Primeiro número
        int b = 10; // Segundo número

        // Chamando a função somar e armazenando o resultado
        int resultado = somar(a, b);

        // Exibindo o resultado da soma
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }
}