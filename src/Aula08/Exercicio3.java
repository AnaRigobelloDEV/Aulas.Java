package Aula08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio3 {
    public static void main(String[] args) {
        /* Exercício 3: Copiar Conteúdo de um Arquivo para Outro
        Crie um programa que copie o conteúdo do arquivo alunos.txt para um
        novo arquivo chamado backup_alunos.txt.
        • Utilize a classe FileReader para ler o arquivo de origem.
        • Utilize a classe BufferedReader para otimizar a leitura.
        • Utilize a classe FileWriter para escrever no arquivo de destino.
        • Utilize a classe BufferedWriter para otimizar a escrita.
        • Garanta que os fluxos de leitura e escrita sejam fechados
        corretamente e trate os erros que podem ocorrer durante o processo
        de leitura ou escrita.
        Dica: Leia o arquivo linha por linha e escreva cada linha no novo arquivo. */

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            // Criando FileReader e BufferedReader para o arquivo de origem
            File arquivoOrigem = new File("alunos.txt");
            FileReader fileReader = new FileReader(arquivoOrigem);
            bufferedReader = new BufferedReader(fileReader);

            // Criando FileWriter e BufferedWriter para o arquivo de destino
            File arquivoDestino = new File("backup_alunos.txt");
            FileWriter fileWriter = new FileWriter(arquivoDestino);
            bufferedWriter = new BufferedWriter(fileWriter);

            String linha;

            // Lendo e escrevendo cada linha do arquivo
            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine(); // Adiciona nova linha
            }

            System.out.println("Cópia do arquivo realizada com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        } finally {
            // Garantindo que os fluxos de leitura e escrita sejam fechados
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Erro ao fechar os arquivos: " + e.getMessage());
            }
        }
    }
}
