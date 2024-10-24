package Aula06.Exercicios;

import java.util.Scanner;

public class DESAFIO2_PROFESSOR_FLEXIVEL {
    static String[][] matrizCadastro = {null};

    public static void main(String[] args) {
        String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
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
                    cadastrarUsuario(scanner);
                    break;
                case 2:
                    exibirCadastro(cabecalho);
                    break;
                case 3:
                    break;
                case 4:
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

    private static void cadastrarUsuario(Scanner scanner) {
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
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
    }

    private static void exibirCadastro(String[] cabecalho) {
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }

    private static void deletarUsuario()  {
    }
}