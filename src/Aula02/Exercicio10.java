package Aula02;

public class Exercicio10 {
    public static void main(String[] args) {

        short numShort = 8;
        int numInt = 0;
        byte numByte = 0;

        numInt = numShort;

        numByte = (byte) numShort;

        System.out.println("em short = " + numShort);
        System.out.println( "em inteiro (casting implícito) = " + numInt);
        System.out.println("em byte (casting explicito) = " + numByte);

    }
}
