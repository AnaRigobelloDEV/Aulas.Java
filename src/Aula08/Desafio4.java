package Aula08;

import java.io.*;
import java.util.Scanner;

public class Desafio4 {
    private static final String ARQUIVO = "G:\\AnaRigobello\\NOTES RAFA DEV\\bancoDeDados.txt"; // Nome do arquivo
    private static String[][] usuarios = new String[100][4]; // Matriz para armazenar até 100 usuários
    private static int contador = 0; // Contador de usuários

    public static void main(String[] args) {
        carregarDados(); // Carrega dados do arquivo na matriz
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Atualizar pessoa");
            System.out.println("3. Excluir pessoa");
            System.out.println("4. Listar pessoas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarPessoa(scanner);
                    break;
                case 2:
                    atualizarPessoa(scanner);
                    break;
                case 3:
                    excluirPessoa(scanner);
                    break;
                case 4:
                    listarPessoas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void carregarDados() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(":");
                if (dados.length == 4) {
                    usuarios[contador++] = dados; // Adiciona à matriz
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

    private static void salvarDados() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (int i = 0; i < contador; i++) {
                bw.write(String.join(":", usuarios[i]));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private static void cadastrarPessoa(Scanner scanner) {
        if (contador >= usuarios.length) {
            System.out.println("Limite de usuários alcançado.");
            return;
        }

        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        usuarios[contador++] = new String[]{id, nome, email, telefone}; // Adiciona à matriz
        salvarDados(); // Salva os dados no arquivo
        System.out.println("Cadastro realizado com sucesso!");
    }

    private static void atualizarPessoa(Scanner scanner) {
        System.out.print("Informe o ID da pessoa a ser atualizada: ");
        String id = scanner.nextLine();

        for (int i = 0; i < contador; i++) {
            if (usuarios[i][0].equals(id)) {
                System.out.print("Novo Nome: ");
                usuarios[i][1] = scanner.nextLine();
                System.out.print("Novo E-mail: ");
                usuarios[i][2] = scanner.nextLine();
                System.out.print("Novo Telefone: ");
                usuarios[i][3] = scanner.nextLine();
                salvarDados(); // Salva as alterações
                System.out.println("Atualização realizada com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    private static void excluirPessoa(Scanner scanner) {
        System.out.print("Informe o ID da pessoa a ser excluída: ");
        String id = scanner.nextLine();

        for (int i = 0; i < contador; i++) {
            if (usuarios[i][0].equals(id)) {
                // Desloca os dados para cima na matriz
                for (int j = i; j < contador - 1; j++) {
                    usuarios[j] = usuarios[j + 1];
                }
                usuarios[--contador] = null; // Remove referência do último
                salvarDados(); // Salva as alterações
                System.out.println("Exclusão realizada com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    private static void listarPessoas() {
        System.out.println("Lista de pessoas:");
        for (int i = 0; i < contador; i++) {
            System.out.println("ID: " + usuarios[i][0] + ", Nome: " + usuarios[i][1] +
                    ", E-mail: " + usuarios[i][2] + ", Telefone: " + usuarios[i][3]);
        }
    }
}
