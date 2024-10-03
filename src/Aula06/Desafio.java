package Aula06;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mostraValor = "matriz{\n";

        int[][] matriz = new int[2][2];

        for (int linha = 0; linha < matriz.length; linha++) {
            mostraValor += "\t{";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da posição["+linha+","+coluna+"]=");
                matriz[linha][coluna] = scanner.nextInt();
                mostraValor += matriz[linha][coluna];
                mostraValor += coluna < (matriz[linha].length - 1)?",":"}";
            }
            mostraValor += linha < (matriz.length - 1)?",\n": "\n}";
        }
        System.out.println(mostraValor);
    }
}