package Aula08;

public class Exemplo8 {
    public static void main(String[] args) {
        String linha = "ID:1 ;Nome:Ana ;Idade:18";
        String[] tokens = linha.split(";");
        for (String token : tokens) {
            System.out.println(token);
        }
        String text = "";
        for (int i = 0; i < tokens.length; i++) {
            String Valor = tokens[i].split(":")[1];
            text += Valor + ",";
        }
        System.out.println(text);
        String[] idade = tokens[2].split(":");
        int ValorIdade = Integer.parseInt(idade[1]);
        System.out.println("A idade agora é: " + (ValorIdade + 1));

    }
}