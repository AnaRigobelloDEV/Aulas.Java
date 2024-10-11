package Aula08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2 {
    public static void main(String[] args) {
        /* Exercício 2: Leitura de Arquivo de Texto
        Desenvolva um programa que leia o conteúdo do arquivo alunos.txt
        (criado no exercício anterior) e exiba os nomes dos alunos no console.
        • Utilize a classe FileReader para ler o arquivo.
        • Utilize a classe BufferedReader para melhorar a eficiência da
        leitura.
        • Lembre-se de fechar o fluxo de leitura e tratar os possíveis erros
        (por exemplo, caso o arquivo não exista).
        Dica: Utilize um loop para ler todas as linhas do arquivo até que não
        haja mais conteúdo (ou seja, quando o método readLine() retornar null). */

        BufferedReader bufferedReader = null;

        try {
            // Criando o FileReader e BufferedReader
            File arquivo = new File("alunos.txt");
            FileReader fileReader = new FileReader(arquivo);
            bufferedReader = new BufferedReader(fileReader);

            String linha;
            System.out.println("Nomes dos alunos:");

            // Lendo e exibindo cada linha do arquivo
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            // Garantindo que o BufferedReader será fechado
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
