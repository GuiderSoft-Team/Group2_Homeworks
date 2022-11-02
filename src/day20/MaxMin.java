package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
//        Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
//        En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
//
//        Not: Problemi, Grup2_Homeworks ( GitHub'da var) projesi içerisine day20 package'ı açıp, MaxMin sınıfı
//        oluşturarak çözünüz.

        Scanner input = new Scanner(System.in);
        int[] newList = new int[3];

        for (int i = 0; i < newList.length; i++) {
            System.out.println((i + 1) + ". Numarayı giriniz");
            newList[i] = input.nextInt();
        }
        int max = newList[0];
        int min = newList[0];
        for (int num :
                newList) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

        }
        for (int num :
                newList) {
            System.out.print(num + " ");
        }

        System.out.println("\nMaksimum değer: " + max);
        System.out.println("Minimum değer: " + min);
    }
}
