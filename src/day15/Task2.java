package day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //UsTaLi — dün 23:20
        //Task 2:
        //Alan ve Çevre Hesaplama
        //1. Kare
        //2. Daire
        //Seçiminiz:
        //
        //Yukarıdaki menüyü tasarlayınız.
        //Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Alan ve Çevre Hesaplama");
        System.out.println("1. Kare");
        System.out.println("2. Daire");
        System.out.print("Seçiminiz: ");
        int secim= input.nextInt();

        switch (secim){
            case 1:
                System.out.print("Karenin Kenar Uzunluğu: ");
                int kenar=input.nextInt();
                int alan=kenar*kenar;
                int cevre=4*kenar;
                System.out.printf("Karenin alanı %d cm karedir. Çevresi %d cm'dir.",alan,cevre);
                break;
            case 2:
                System.out.print("Dairenin Yarıçap Uzunluğu: ");
                int yaricap=input.nextInt();
                double dAlan=alanHesapla(yaricap);
                double dCevre=cevreHesapla(yaricap);
                System.out.printf("Dairenin alanı %10.2f cm karedir. Çevresi %10.2f cm'dir.",dAlan,dCevre);
                break;
            default:
                System.out.printf("Yanlış seçim yaptınız.");
                break;
        }


    }

    private static double alanHesapla(int yaricap) {
        return Math.PI*Math.pow(yaricap,2);
    }
    private static double cevreHesapla(int yaricap){
        return 2*Math.PI*yaricap;
    }
}
