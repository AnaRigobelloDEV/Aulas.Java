package Aula05;

public class Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;  // Variável para armazenar a soma
        int numero = 1; // Começamos do número 1

        while (numero <= 100) {
            // Verifica se o número é par
            if (numero % 2 == 0) {
                soma += numero; // Adiciona o número par à soma
            }
            numero++; // Incrementa o número
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
