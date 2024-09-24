package Aula04;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe que horas são agora : ");

        int horas = scanner.nextInt();

        if (horas >= 5 && horas <= 12) {
            System.out.println("Agora são " + horas + "h" +" da manhã. ");
        } else if (horas > 12 && horas <= 18) {
            System.out.println("Agora são " + horas + "h" + "da tarde. ");
        } else if (horas > 18 && horas <= 22) {
            System.out.println("Agora são " + horas + "h" + " da noite. ");
        } else if (horas > 22  && horas <= 23 || horas >= 0 && horas < 5) {
            System.out.println("Agora são " + horas +"h" + " da madrugada ");
        }else {
            System.out.println("Parece que você não tem noção do tempo né ? ");
        }

        scanner.close();
    }
}
