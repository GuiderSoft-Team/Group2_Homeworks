package day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1.Kare ");
        System.out.println("2.Daire ");
        System.out.print("İşlem Yapacağınız Geometrik Şekli Seçiniz :");
        int secim = input.nextInt();
        String sonuc = "";


        switch (secim) {
            case 1:
                System.out.print("karenin Kenar uzunluğu :");
                int kenar=input.nextInt();
                int alan=kenar*kenar;
                int cevre=4*kenar;
                System.out.printf("Karenin Alanı %d cm karedir.Çevresi %d cm2 dir. ",alan,cevre);
                break;

            case 2:
                System.out.print("DaireninYarıçap Uzunluğu :");
                int yaricap=input.nextInt();
                double dAlan=alanHesapla(yaricap);
                double dCevre=cevreHesapla(yaricap);
                System.out.printf("Dairenin Alanı : %5.2f  cm karedir.Çevresi : %5.2f  cm2 dir. ",dAlan,dCevre);
                break;

        default:
            System.out.printf("Yanlış Seçim Yaptınız");

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
