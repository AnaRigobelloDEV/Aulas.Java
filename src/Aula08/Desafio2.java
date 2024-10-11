package Aula08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Desafio2 {
    public static void main(String[] args) {
        /* DESAFIO: MANIPULAÇÃO DE ARQUIVOS
        Entendimento da Nova Função: Carregar Dados do Arquivo
        • Agora, o programa deverá ler um arquivo de texto que contém os
        dados dos usuários e carregar essas informações na matriz que já
        foi usada no desafio anterior. O formato do arquivo seguirá o
        padrão:
        ➢ Cada linha do arquivo conterá os dados de um usuário no
        formato:
        • cabeçalho = “ID:Nome:E-mail:Telefone”
        • 1º cadastro =“01:Rafael:rafael@email.com:11900000000”
        ➢ Cada conjunto de informações estará separado por \n (quebra
        de linha), de modo que cada linha represente um cadastro. */

        String arquivo = "cadastro.txt"; // Nome do arquivo
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
