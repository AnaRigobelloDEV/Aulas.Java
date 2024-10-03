package Aula07;

import java.util.Scanner;

public class Desafio_2 {

    /*Sistema de Cadastro com Menu e Funções:
Baseando-se no desafio da última aula, onde criamos um
sistema de cadastro utilizando uma matriz para armazenar
dados, agora vamos expandir o programa para torná-lo mais
completo e fácil de manter.*/


    private static String[][] registros = new String[100][2]; // 100 registros, 2 campos (nome e email)
    private static int contador = 0; // Contador para o número de registros

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro ===");
            System.out.println("1. Adicionar Registro");
            System.out.println("2. Visualizar Registros");
            System.out.println("3. Buscar Registro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarRegistro(scanner);
                    break;
                case 2:
                    visualizarRegistros();
                    break;
                case 3:
                    buscarRegistro(scanner);
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

    private static void adicionarRegistro(Scanner scanner) {
        if (contador >= registros.length) {
            System.out.println("Capacidade máxima de registros alcançada.");
            return;
        }
        System.out.print("Digite o nome: ");
        registros[contador][0] = scanner.nextLine();
        System.out.print("Digite o email: ");
        registros[contador][1] = scanner.nextLine();
        contador++;
        System.out.println("Registro adicionado com sucesso!");
    }

    private static void visualizarRegistros() {
        if (contador == 0) {
            System.out.println("Nenhum registro encontrado.");
            return;
        }
        System.out.println("\n=== Registros ===");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". Nome: " + registros[i][0] + ", Email: " + registros[i][1]);
        }
    }

    private static void buscarRegistro(Scanner scanner) {
        System.out.print("Digite o nome para buscar: ");
        String nomeBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (registros[i][0].equalsIgnoreCase(nomeBuscado)) {
                System.out.println("Registro encontrado: Nome: " + registros[i][0] + ", Email: " + registros[i][1]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Registro não encontrado.");
        }
    }
}
