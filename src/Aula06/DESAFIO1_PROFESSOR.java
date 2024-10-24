package Aula06;

import java.util.Scanner;

public class DESAFIO1_PROFESSOR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de usuários que desja cadastrar");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"ID: ", "NOME: ", "TELEFONE: ", "EMAIL: "};
        String[][] matrizCadastro = new String[qtdUsuarios + 1][4];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preencha os dados a seguir: ");
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++){
            System.out.println("ID: ");
            matrizCadastro[linhas][0] =scanner.nextLine();
            System.out.println("NOME: ");
            matrizCadastro[linhas][1] =scanner.nextLine();
            System.out.println("TELEFONE: ");
            matrizCadastro[linhas][2] =scanner.nextLine();
            System.out.println("EMAIL: ");
            matrizCadastro[linhas][3] =scanner.nextLine();
        }
for (int linhas = 0; linhas < matrizCadastro.length; linhas++){
            System.out.println(matrizCadastro[linhas][0]+"\t"+matrizCadastro[linhas][1]+"\t\t\t" + matrizCadastro[linhas][2]+"\t\t\t"+matrizCadastro[linhas][3]);

        }
    }
}
