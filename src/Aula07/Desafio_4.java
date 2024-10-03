package Aula07;

import java.util.Scanner;

public class Desafio_4 {

    /* Sistema de Cadastro com Menu e Funções:
       Este programa permite cadastrar, consultar,
       atualizar e deletar usuários em uma matriz. */

    private static String[][] registros = new String[100][2]; // 100 registros, 2 campos (nome e email)
    private static int contador = 0; // Contador para o número de registros

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro ===");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Consultar Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Deletar Usuário");
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
                case 3:
                    atualizarUsuario(scanner);
                    break;
                case 4:
                    deletarUsuario(scanner);
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

    private static void atualizarUsuario(Scanner scanner) {
        System.out.print("Digite o nome do usuário a ser atualizado: ");
        String nomeBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (registros[i][0].equalsIgnoreCase(nomeBuscado)) {
                System.out.print("Digite o novo nome: ");
                registros[i][0] = scanner.nextLine();
                System.out.print("Digite o novo email: ");
                registros[i][1] = scanner.nextLine();
                encontrado = true;
                System.out.println("Usuário atualizado com sucesso!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void deletarUsuario(Scanner scanner) {
        System.out.print("Digite o nome do usuário a ser deletado: ");
        String nomeBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (registros[i][0].equalsIgnoreCase(nomeBuscado)) {
                // Desloca os registros para remover o usuário
                for (int j = i; j < contador - 1; j++) {
                    registros[j] = registros[j + 1];
                }
                registros[contador - 1] = null; // Limpa o último registro
                contador--;
                encontrado = true;
                System.out.println("Usuário deletado com sucesso!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuário não encontrado.");
        }
    }
}
