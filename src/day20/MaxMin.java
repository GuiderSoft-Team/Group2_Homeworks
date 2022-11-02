package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        int[] sayi=new int[3];

        for (int i = 0; i <sayi.length ; i++) {
            System.out.println((i + 1) + ". sayi giriniz");
            sayi[i] = new Scanner(System.in).nextInt();
        }
        int max = sayi[0];
        int min = sayi[0];
        for (int sayilar:sayi
             ) {

            if (sayilar > max) {
                max = sayilar;
            }
            if (min > sayilar) {
                min = sayilar;
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Mix = "+min);
   }
}
