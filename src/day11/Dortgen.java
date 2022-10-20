package day11;

import java.util.Scanner;

public class Dortgen {
    public static void main(String[] args) {

        //TODO: Dortgen programını geliştiriniz.
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
        System.out.print("Karenin kenarını giriniz: ");
        int squareLength = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int rectShortLength = input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int rectLongLength = input.nextInt();
        int toplamAlan = alanHesapla(squareLength) + alanHesapla(rectLongLength, rectShortLength);
        System.out.println("Alanlar toplamı: " + toplamAlan);
        int toplamCevre= cevreHesapla(squareLength) + cevreHesapla(rectLongLength, rectShortLength);
        System.out.println("Çevreler Toplamı: " + toplamCevre);




    }

    public static int alanHesapla(int a) {
        return a * a;
    }

    public static int alanHesapla(int a, int b) {
        return a * b;
    }

    public static int cevreHesapla(int a) {
        return a * 4;
    }

    public static int cevreHesapla(int a, int b) {
        return (a + b) * 2;
    }
}
