package Aula07;

public class Exercicio07 {

    // Função que determina o maior de três números inteiros
    public static int maiorNumero(int num1, int num2, int num3) {
        int maior = num1; // Assume que o primeiro número é o maior

        // Verifica se num2 é maior que o atual maior
        if (num2 > maior) {
            maior = num2;
        }
        // Verifica se num3 é maior que o atual maior
        if (num3 > maior) {
            maior = num3;
        }
        return maior; // Retorna o maior número encontrado
    }
    public static void main(String[] args) {
        int a = 5; // Primeiro número
        int b = 10; // Segundo número
        int c = 7; // Terceiro número

        // Chamando a função para determinar o maior número
        int maior = maiorNumero(a, b, c);

        // Exibindo o resultado
        System.out.println("O maior número entre " + a + ", " + b + " e " + c + " é: " + maior);
    }
}