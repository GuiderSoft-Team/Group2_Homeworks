package day11;

import java.util.Scanner;

public class Dortgen {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Karenin Kenari: ");
            int kenar = input.nextInt();
            System.out.print("Dikdortgenin Uzun Kenari:");
            int uzunKenar = input.nextInt();
            System.out.print("Dikdortgenin Kisa Kenari:");
            int kisaKenar = input.nextInt();

            int kareninAlani = alanHesapla(kenar, kenar);
            int dikdortgeninAlani = alanHesapla(uzunKenar, kisaKenar);

            int kareninCevresi = cevreHesapla(kenar, kenar);
            int dikdortgeninCevresi = cevreHesapla(uzunKenar, kisaKenar);


            int toplamAlan=kareninAlani+dikdortgeninAlani;
            int toplamCevre=kareninCevresi+dikdortgeninCevresi;
            System.out.println("Toplam Alan: "+toplamAlan);
            System.out.println("Toplam Cevre: "+toplamCevre);

        }

        public static int alanHesapla(int kenar1, int kenar2) {
            return kenar1*kenar2;
        }
        public static int cevreHesapla(int kenar1, int kenar2) {
            return (kenar1+kenar2)*2;


    }


}
