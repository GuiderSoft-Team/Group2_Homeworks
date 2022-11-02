package day16;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1, kenar2;

        System.out.print("1. Kenarı giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2 = input.nextInt();

        System.out.println("Dikdörtgenin alanı = " + (kenar1 * kenar2));
        System.out.println("Dikdörtgenin çevresi = " + (2 * (kenar1 + kenar2)));


    }
}

