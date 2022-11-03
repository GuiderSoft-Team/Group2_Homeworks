package day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kare için kenar : ");
        int kenar = input.nextInt();
        System.out.print("Dikdörtgen için Kısa keanr : ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdörtgen için Uzun kenar : ");
        int uzunKenar= input.nextInt();

        int kareninAlani=alanHesapla(kenar,kenar);
        int kareninCevresi=cevreHesapla(kenar,kenar);

        int dikdortgeninAlani=alanHesapla(kisaKenar,uzunKenar);
        int dikdortgeninCevresi=cevreHesapla(kisaKenar,uzunKenar);

        int toplamAlan=kareninAlani+dikdortgeninAlani;
        int toplamCevre=kareninCevresi+dikdortgeninCevresi;

        System.out.println("Toplam Alan = "+toplamAlan);
        System.out.println("Toplam Çevre = "+toplamCevre);


    }

    public static int alanHesapla(int k1,int k2){
        return k1*k2;
    }

    public static int cevreHesapla(int k1,int k2){
        return 2*(k1+k2);
    }

}
