package Aula08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        String arquivo = "G:\\AnaRigobello\\NOTES RAFA DEV\\bancoDeDados.txt"; // Nome do arquivo
        String[][] usuarios = new String[100][4]; // Matriz para armazenar até 100 usuários
        int contador = 0;

        // Lendo dados do arquivo
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

        // Adicionando novos usuários a partir da entrada do usuário
        Scanner scanner = new Scanner(System.in);
        while (contador < usuarios.length) {
            System.out.println("Deseja adicionar um novo usuário? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.print("Digite o ID: ");
            String id = scanner.nextLine();
            System.out.print("Digite o Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o E-mail: ");
            String email = scanner.nextLine();
            System.out.print("Digite o Telefone: ");
            String telefone = scanner.nextLine();

            usuarios[contador][0] = id;
            usuarios[contador][1] = nome;
            usuarios[contador][2] = email;
            usuarios[contador][3] = telefone;
            contador++;

            // Verifica se a matriz está cheia
            if (contador >= usuarios.length) {
                System.out.println("A matriz está cheia, não é possível adicionar mais usuários.");
                break;
            }
        }

        // Exibe os dados finais
        System.out.println("Dados finais:");
        for (int i = 0; i < contador; i++) {
            System.out.println("ID: " + usuarios[i][0] + ", Nome: " + usuarios[i][1] +
                    ", E-mail: " + usuarios[i][2] + ", Telefone: " + usuarios[i][3]);
        }

        // Salvando os dados no arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) { // Modo de adição
            for (int i = 0; i < contador; i++) {
                bw.write(usuarios[i][0] + ":" + usuarios[i][1] + ":" + usuarios[i][2] + ":" + usuarios[i][3]);
                bw.newLine();
            }
            System.out.println("Dados salvos no arquivo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados no arquivo: " + e.getMessage());
        }

        scanner.close(); // Fecha o scanner
    }
}
