package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

        int[] sayi = new int[3];


        Scanner input = new Scanner(System.in);

        for (int i = 0; i < sayi.length; i++) {

            System.out.println((i + 1) + ". sayiyi girin");
            sayi[i] = input.nextInt();


        }

        int min = sayi[0];
        int max = sayi[0];

        for (int deger : sayi
        ) {
            if (deger > max) {
                max = deger;
            }
            if (deger < min) {
                min = deger;
            }


        }

        System.out.println("Max= " + max);
        System.out.println("Min= " + min);


    }
}
