package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] dizi=new int[10];
        Scanner input=new Scanner(System.in);
        int i,en_buyuk,en_kucuk;
        for ( i = 0; i < 10; i++) {
            System.out.print("Lütfen Rasgele Sayı Giriniz : ");
            dizi[i]=input.nextInt();
        }
        en_kucuk=dizi[0];
        en_buyuk=dizi[0];
        for ( i= 1; i< 10; i++) {
            if (dizi[i]>en_buyuk) en_buyuk=dizi[i];
            if (dizi[i]<en_kucuk) en_kucuk =dizi[i];

        }
        System.out.println("En Büyük Eleman  : "+en_buyuk);
        System.out.println("En Küçük Eleman  : "+en_kucuk);
    }
}
