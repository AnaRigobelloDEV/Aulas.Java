package Aula07;

public class Exercicio03 {
    /*Exercício 3: Função para Calcular o Dobro de um Número
Crie uma função chamada dobrar que receba um número inteiro
e retorne o dobro dele. Exiba o resultado no métod0 main.*/

    // Função que calcula o dobro de um número inteiro
    public static int dobrar(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        int numero = 7; // Número a ser dobrado

        // Chamando a função dobrar e armazenando o resultado
        int resultado = dobrar(numero);

        // Exibindo o resultado do dobro
        System.out.println("O dobro de " + numero + " é: " + resultado);
    }
}