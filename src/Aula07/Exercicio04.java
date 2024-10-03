package Aula07;

public class Exercicio04 {

    // Função que converte graus Celsius para Fahrenheit
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        double celsius = 25; // Valor em graus Celsius

        // Chamando a função de conversão e armazenando o resultado
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);

        // Exibindo o resultado da conversão
        System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit.%n", celsius, fahrenheit);
    }
}
