package Aula08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Desafio3 {
    public static void main(String[] args) {
        /* Como Ler e Preencher a Matriz:
        • Quando o programa iniciar, ele deverá ler o arquivo
        bancoDeDados.txt e preencher a matriz que já está sendo usada
        no sistema com as informações contidas no arquivo.
        Vocês deverão:
        1. Ler cada linha do arquivo.
        2. Separar os dados com base no token “:” usando o método
        split().
        3. Preencher a matriz com os dados separados.
        4. Certificar-se de que a matriz tem o tamanho correto para
        armazenar todos os dados. */

        String arquivo = "bancoDeDados.txt"; // Nome do arquivo
        String[][] usuarios = new String[100][4]; // Matriz para armazenar até 100 usuários
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(":"); // Divide a linha em partes

                // Verifica se a linha contém o número correto de dados
                if (dados.length == 4) {
                    usuarios[contador][0] = dados[0]; // ID
                    usuarios[contador][1] = dados[1]; // Nome
                    usuarios[contador][2] = dados[2]; // E-mail
                    usuarios[contador][3] = dados[3]; // Telefone
                    contador++;
                } else {
                    System.out.println("Formato inválido na linha: " + linha);
                }

                // Verifica se a matriz está cheia
                if (contador >= usuarios.length) {
                    System.out.println("A matriz está cheia, não é possível adicionar mais usuários.");
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibe os dados carregados
        System.out.println("Dados carregados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("ID: " + usuarios[i][0] + ", Nome: " + usuarios[i][1] +
                    ", E-mail: " + usuarios[i][2] + ", Telefone: " + usuarios[i][3]);
        }
    }
}
