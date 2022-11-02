package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] dizi=new int[10];
        Scanner input=new Scanner(System.in);
        int i,en_buyuk;
        for (i = 0; i < 10; i++) {
            System.out.print("Lütfen 10 Adet Rasgele Sayı giriniz :");
            dizi[i]=input.nextInt();}
        en_buyuk=dizi[0];
        for ( i= 1; i< 10; i++) {
            if (dizi[i]>en_buyuk) en_buyuk=dizi[i];

        }
        System.out.println("En Büyük Eleman : "+en_buyuk);
    }
}
