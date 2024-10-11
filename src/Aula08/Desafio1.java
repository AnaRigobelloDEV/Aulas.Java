package Aula08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Pessoa(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + email + ";" + telefone;
    }
}

public class Desafio1 {
    private static final String ARQUIVO = "cadastro.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = carregarPessoas();

        while (true) {
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("E-mail: ");
                String email = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                pessoas.add(new Pessoa(id, nome, email, telefone));
                salvarPessoas(pessoas);
                System.out.println("Pessoa cadastrada com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Lista de pessoas:");
                for (Pessoa pessoa : pessoas) {
                    System.out.println(pessoa);
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static List<Pessoa> carregarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String email = dados[2];
                String telefone = dados[3];
                pessoas.add(new Pessoa(id, nome, email, telefone));
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar pessoas: " + e.getMessage());
        }
        return pessoas;
    }

    private static void salvarPessoas(List<Pessoa> pessoas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Pessoa pessoa : pessoas) {
                bw.write(pessoa.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar pessoas: " + e.getMessage());
        }
    }
}
