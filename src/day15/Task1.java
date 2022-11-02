package day15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task 1: Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız.
        // Verilen açılara göre; "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren
        // Java programını yazınız.
        //
        //Not: Üçgenin iç açıları toplamı 180'dir.

        final int UCGEN_IC_ACILAR_TOPLAMI=180;


        Scanner input = new Scanner(System.in);
        System.out.println("Üçgen Geometrik şekli için Açı değerlerini giriniz.");
        System.out.print("A açısı : ");
        int a= input.nextInt();

        System.out.print("B açısı : ");
        int b= input.nextInt();

        System.out.print("C açısı : ");
        int c= input.nextInt();

        int acilarToplami=a+b+c;

        if(acilarToplami==UCGEN_IC_ACILAR_TOPLAMI){
            System.out.println("Bu şekil bir üçgendir");
        }else {
            System.out.println("Bu şekil bir üçgen değildir");
        }

    }
}
