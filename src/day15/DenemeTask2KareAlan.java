package day15;

import java.util.Scanner;

public class DenemeTask2KareAlan {
    public static void main(String[] args) {
        System.out.println("Alan Ve Daire Hesapla");
        System.out.println("1.Kare ");
        System.out.println("2.Daire ");
        System.out.print("Seciminiz");
        int secim=new Scanner(System.in).nextInt();
        switch (secim){
            case 1:
                System.out.print("Karenin alanı icin kenar giriniz:");
                int kkenar=new Scanner(System.in).nextInt();
                int alank=alanHesapla(kkenar);
                int kcevre=cevreHesapla(kkenar);
                System.out.printf("Karenin alanı:%d\t\nKarenin cevresi:%d",kcevre,alank);


                break;
            case 2:
                System.out.print("Daire icin yaricap gir:");
                int yaricap=new Scanner(System.in).nextInt();
                double dalan=dalanHesapla(yaricap);
                double dcevre=dcevreHeasapla(yaricap);
                System.out.printf("Dairenin alanı:%5.2f\t\nDairesinin cevresi:%5.2f",dcevre,dalan);
                break;
            default:
                System.out.println("Yanlıs secim");
                break;
        }
        System.out.printf("");

    }

    private static double dcevreHeasapla(int yaricap) {
         return 2*Math.PI*yaricap;
    }

    private static int cevreHesapla(int kkenar) {
        return 4*kkenar;
    }

    private static double dalanHesapla(int yarıcap) {


        return Math.PI*Math.pow(yarıcap,2);
    }

    private static int alanHesapla(int k1) {
        return k1*k1;
    }

}
