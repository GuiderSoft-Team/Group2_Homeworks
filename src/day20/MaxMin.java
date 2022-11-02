package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        /*
            Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
            En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
         */
        int[] sayilar={10,45,32,96,75,63,81,100,21,4};
        int buyukSayi=sayilar[0];
        int kucukSayi=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>buyukSayi){
                buyukSayi=sayilar[i];
            } if (sayilar[i] < kucukSayi) {
                kucukSayi=sayilar[i];
            }
        }
        System.out.println("Buyuk sayi : "+buyukSayi);
        System.out.println("Kucuk sayi : "+kucukSayi);

    }
}
