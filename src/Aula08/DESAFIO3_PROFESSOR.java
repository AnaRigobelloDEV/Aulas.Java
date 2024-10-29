package Aula08.Exercicios;

import java.io.*;
import java.util.Scanner;

public class DESAFIO3_PROFESSOR {
    static String[][] matrizCadastro = {null};
    static String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
    static Scanner scanner = new Scanner(System.in);
    static File bancoDeDados = new File("src\\Aula08\\bancoDeDados.txt");

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("\t1- Cadastrar usuários");
            System.out.println("\t2- Exibir os usuários cadastrados");
            System.out.println("\t3- Atualizar um usuário");
            System.out.println("\t4- Deletar um usuário");
            System.out.println("\t5- Sair do programa");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    exibirCadastro();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 5);
    }

    private static void cadastrarUsuario() {
        System.out.print("Digite a quantidade de pessoas a serem cadastradas: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdUsuarios][matrizCadastro[0].length];
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }
        System.out.println("Preencha os dados a seguir:");
        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
            novaMatriz[linhas][0] = String.valueOf(linhas);
            System.out.println(matrizCadastro[0][0] + ": " + linhas);
            for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    private static void exibirCadastro() {
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }

    private static void atualizarUsuario() {
        exibirCadastro();
        System.out.print("Digite o ID do usuário que deseja atualizar: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Atualize as informações do usuário:");
        System.out.println(matrizCadastro[0][0] + ": " + matrizCadastro[idUsuario][0]);
        for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
            System.out.print(matrizCadastro[0][colunas] + ": ");
            matrizCadastro[idUsuario][colunas] = scanner.nextLine();
        }
        System.out.println("Usuário atualizado.");
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    private static void deletarUsuario() {
        exibirCadastro();
        System.out.print("Digite o ID do usuário que deseja deletar: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length - 1][matrizCadastro[0].length];
        novaMatriz[0] = cabecalho;
        for (int linhaMatrizCadastro = 1, linhaNovaM = 1; linhaMatrizCadastro < matrizCadastro.length; linhaMatrizCadastro++) {
            if (idUsuario == linhaMatrizCadastro) continue;
            novaMatriz[linhaNovaM] = matrizCadastro[linhaMatrizCadastro];
            novaMatriz[linhaNovaM][0] = String.valueOf(linhaNovaM);
            linhaNovaM++;
        }
        matrizCadastro = novaMatriz;
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    private static void salvarDadosNoArquivo() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bancoDeDados))) {
            for (String[] linhaMatriz : matrizCadastro) {
                bufferedWriter.write(String.join(",", linhaMatriz) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void carregarDadosDoArquivo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(bancoDeDados))) {
            if (!bancoDeDados.exists()) return;
            String linha = "", dados = "";
            while ((linha = bufferedReader.readLine()) != null) ;
            {
                dados += linha + "\n";
            }
            String[] linhaUsuario = dados.split("\n");
            int qtdColunas = linhaUsuario[0].split(",").length;
            matrizCadastro = new String[linhaUsuario.length][qtdColunas];
            for (int linhas = 0; linhas < linhaUsuario.length; linhas++) {
                matrizCadastro[linhas] = linhaUsuario[linhas].split(",");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}