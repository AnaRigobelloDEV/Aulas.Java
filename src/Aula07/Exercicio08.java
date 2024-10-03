package Aula07;

public class Exercicio08 {

    // Função que calcula o fatorial de um número inteiro positivo
    public static long calcularFatorial(int numero) {
        long fatorial = 1; // Inicializa o fatorial

        for (int i = 2; i <= numero; i++) {
            fatorial *= i; // Multiplica pelo número atual
        }
        return fatorial; // Retorna o fatorial calculado
    }
    public static void main(String[] args) {
        int numero = 5; // Número para calcular o fatorial

        // Chamando a função para calcular o fatorial
        long resultado = calcularFatorial(numero);

        // Exibindo o resultado
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}