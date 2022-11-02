package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
/*        Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
          En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
            Not: Problemi, Grup2_Homeworks ( GitHub'da var) projesi içerisine day20 package'ı açıp, MaxMin sınıfı oluşturarak çözünüz.*/


//
//        Not: Problemi, Grup2_Homeworks ( GitHub'da var) projesi içerisine day20 package'ı açıp, MaxMin sınıfı
//        oluşturarak çözünüz.

        Scanner input = new Scanner(System.in);
        int[] liste = new int[10];
        for (int i = 0; i < liste.length; i++) {
            System.out.println((i + 1) + ". numara : ");
            liste[i] = input.nextInt();
        }
        int max = liste[0];
        int min = liste[0];

        for (int num :
                liste) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }

        }
        System.out.println("max değer :" + max);
        System.out.println("min değer :" + min);


    }
}