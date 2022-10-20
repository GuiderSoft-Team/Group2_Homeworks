package day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {

        Scanner imput=new Scanner(System.in);
        System.out.print("Karenin kenarını giriniz : ");
        int kenar=imput.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz : ");
        int kisaKenar=imput.nextInt();
        System.out.print("Dikdörgenin uzun kenarını giriniz : ");
        int uzunKenar=imput.nextInt();

        int toplamAlan=alanHesapla(kenar,kenar)+alanHesapla(kisaKenar,uzunKenar);
        int toplamCevre=cevreHesapla(kenar,kenar)+cevreHesapla(kisaKenar,uzunKenar);

        System.out.printf("Elde edilen toplam alan  : %d\n",toplamAlan);
        System.out.printf("Elde edilen toplam çevre : %d",toplamCevre);
    }
    public static int alanHesapla(int k1,int k2) {
        return k1*k2;
    }
    public static int cevreHesapla(int k1,int k2) {
        return 2*(k1+k2);
    }
}
