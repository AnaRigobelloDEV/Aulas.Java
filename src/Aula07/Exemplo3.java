package Aula07;

public class Exemplo3 {
    public static void main(String[] args) {
        int soma = funcaoComParametroComRetorno(2, 4);
        System.out.println("retorno da função: " + soma);
    }
    static int funcaoComParametroComRetorno(int parametro1, int parametro2){
        return parametro1 + parametro2;

    }

}
