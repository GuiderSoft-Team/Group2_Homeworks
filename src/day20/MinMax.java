package day20;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        System.out.println("Lütfen 10 adet sayı giriniz ");
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Lütfen " + (i + 1) + "." + " sayıyı giriniz : ");
            sayilar[i] = input.nextInt();
        }
        int min = sayilar[0];
        int max = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (min > sayilar[i]) {
                min = sayilar[i];
            }
            if (max < sayilar[i]) {
                max = sayilar[i];
            }
        }
            System.out.println("max= " + max);
            System.out.println("Min= " + min);
        }
    }
