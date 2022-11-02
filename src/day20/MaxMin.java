package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        /*
        Task:
        Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

        Not: Problemi, Group2_Homeworks ( GitHub'da var) projesi içerisine day20 package'ı açıp,
        MaxMin sınıfı oluşturarak çözünüz.
         */

        int[] sayilar = new int[10];

        System.out.print("10 tane pozitif tam sayı giriniz: ");

        for (int i = 0; i < sayilar.length; i++) {

            sayilar[i] = new Scanner(System.in).nextInt();
        }

        int max = sayilar[0];

        int min = sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {

            if (sayilar[i] > max) {

                max = sayilar[i];
            }
            if (sayilar[i] < min) {

                min = sayilar[i];
            }
        }
        System.out.printf("Dizideki,\nEn büyük sayı = %d\nEn küçük sayı = %d ", max, min);
    }
}

