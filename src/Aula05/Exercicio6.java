package Aula05;

public class Exercicio6 {
    public static void main(String[] args) {
        int primeiro = 0; // Primeiro número da sequência
        int segundo = 1;  // Segundo número da sequência
        int contador = 0; // Contador para os números exibidos

        System.out.println("Os primeiros 10 números da sequência de Fibonacci são:");

        while (contador < 10) {
            System.out.print(primeiro + " "); // Exibe o número atual

            // Calcula o próximo número da sequência
            int proximo = primeiro + segundo;

            // Atualiza os valores para a próxima iteração
            primeiro = segundo;
            segundo = proximo;

            contador++; // Incrementa o contador
        }

        System.out.println(); // Linha em branco após a saída
    }
}
