package day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {
        /*
            1. Klavyeden 3 adet girdi alınacaktır.
                kenar:int       -> Karenin kenarı
                kisaKenar:int   -> Dikdörtgenin kısa kenarı
                uzunKenar:int   -> Dikdörtgenin uzun kenarı
            2. alanHesapla(int k1, int k2):int  -> Metodu geliştirilecektir.
            3. Tek bir metot (alanHesapla) iki kez çağırılarak hem karenin hem de
            dikdörtgenin alanı hesaplanacaktır.
            4. cevreHesapla(int k1,int k2):int  -> Metodu geliştirilecektir.
            5. Tek bir metot (cevreHesapla) iki kez çağırılarak hem karenin hem de
            dikdörtgenin çevresi hesaplanacaktır.
            6. Elde edilen toplam alan hesaplanıp ekranda gösterilecektir.
            7. Elde edilen toplam çevre ekranda gösterilecektir.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("karenin kenarı:");
        int kenar = input.nextInt();

        System.out.print("dikdörtgenin kısa kenarı:");
        int kisaKenar = input.nextInt();
        System.out.print("dikdörtgenin uzun kenarı:");
        int uzunKenar = input.nextInt();

        int kareAlan = alanHesapla(kenar, kenar);
        System.out.println("karenin alanı=" + kareAlan);
        int dortgenAlan = alanHesapla(kisaKenar, uzunKenar);
        System.out.println("Dörgenin Alanı=" + dortgenAlan);

        int kareCevre = cevreHesapla(kenar, kenar);
        System.out.println("karenin çevresi=" + kareCevre);
        int dortgenCevre = cevreHesapla(uzunKenar, kisaKenar);
        System.out.println("dörtgenin çevresi=" + dortgenCevre);
    }

    public static int alanHesapla(int k1, int k2) {
        return k1 * k2;
    }

    public static int cevreHesapla(int c1, int c2) {
        return c1 * c2;
    }


}
