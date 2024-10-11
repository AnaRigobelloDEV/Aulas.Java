package Aula08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /* Exercício 1: Criar e Escrever em um Arquivo de Texto
        Implemente um programa que crie um arquivo chamado alunos.txt e
        permita que o usuário insira o nome de cinco alunos. O programa deve
        escrever esses nomes no arquivo, um em cada linha.
        • Use a classe File para representar o arquivo.
        • Utilize a classe FileWriter para escrever os dados.
        • Lembre-se de fechar o fluxo de escrita após a operação e tratar os
        erros que podem ocorrer, como problemas ao criar ou abrir o
        arquivo.
        Dica: Use try/catch para tratar exceções e garanta que o arquivo será
        fechado, mesmo que ocorra um erro. */

        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        try {
            // Criando o arquivo alunos.txt
            File arquivo = new File("alunos.txt");
            fileWriter = new FileWriter(arquivo);

            System.out.println("Digite o nome de 5 alunos:");

            // Lendo os nomes e escrevendo no arquivo
            for (int i = 1; i <= 5; i++) {
                System.out.print("Aluno " + i + ": ");
                String nome = scanner.nextLine();
                fileWriter.write(nome + System.lineSeparator());
            }

            System.out.println("Nomes dos alunos gravados com sucesso em " + arquivo.getName());

        } catch (IOException e) {
            System.err.println("Erro ao criar ou escrever no arquivo: " + e.getMessage());
        } finally {
            // Garantindo que o FileWriter será fechado
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
            scanner.close();
        }
    }
}
