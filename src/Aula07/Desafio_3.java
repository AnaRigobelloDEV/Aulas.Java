package Aula07;

import java.util.Scanner;

public class Desafio_3 {

    /* Sistema de Cadastro com Menu e Funções:
       Este programa permite cadastrar e
        consultar usuários em uma matriz. */

    private static String[][] registros = new String[100][2]; // 100 registros, 2 campos (nome e email)
    private static int contador = 0; // Contador para o número de registros

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro ===");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Consultar Usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarUsuario(scanner);
                    break;
                case 2:
                    consultarUsuarios();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarUsuario(Scanner scanner) {
        if (contador >= registros.length) {
            System.out.println("Capacidade máxima de registros alcançada.");
            return;
        }
        System.out.print("Digite o nome: ");
        registros[contador][0] = scanner.nextLine();
        System.out.print("Digite o email: ");
        registros[contador][1] = scanner.nextLine();
        contador++;
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void consultarUsuarios() {
        if (contador == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        System.out.println("\n=== Usuários Cadastrados ===");
        System.out.printf("%-20s %-30s%n", "Nome", "Email"); // Cabeçalho
        System.out.println("----------------------------------------");
        for (int i = 0; i < contador; i++) {
            System.out.printf("%-20s %-30s%n", registros[i][0], registros[i][1]);
        }
    }
}
