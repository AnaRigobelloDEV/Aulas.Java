package Aula07;

public class Exercicio06 {

    // Função que verifica se um número é par
    public static boolean verificarPar(int numero) {
        return numero % 2 == 0; // Retorna true se for par, false se for ímpar
    }

    public static void main(String[] args) {
        int numero = 10; // Número a ser verificado

        // Chamando a função e armazenando o resultado
        boolean isPar = verificarPar(numero);

        // Exibindo o resultado
        if (isPar) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
