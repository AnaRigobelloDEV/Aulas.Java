package Aula06;

    import java.util.Scanner;

    public class Exemplo3 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String mostravalor = "vetor{";

            System.out.println("Digite quantos numeros serão digitados");
            int quantidade = teclado.nextInt();
            int[] vetor = new int[quantidade];

            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite o"+ i +" numero");
                vetor[i] = teclado.nextInt();
                mostravalor += vetor[i];
                mostravalor += i< vetor.length-1 ? ", ":"}";
            }
            System.out.println(mostravalor);

            teclado.close();
        }
    }

