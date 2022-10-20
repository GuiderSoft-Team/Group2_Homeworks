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
        System.out.println("Kare ve Dikdörtgenin Çevre ve Alanlarının Hesaplanması");
        System.out.println("-".repeat(55));
        System.out.print("Karenin kenarı :");
        int kareninKenari = input.nextInt();
        System.out.println("-".repeat(30));
        System.out.print("Dikkörtgenin kısa kenarı :");
        int dikdortgeninKisaKenari = input.nextInt();

        System.out.print("Dikkörtgenin uzun kenarı :");
        int dikdortgeninUzunKenari = input.nextInt();
        System.out.println("-".repeat(30));

        int kAlan = alanHesapla(kareninKenari, kareninKenari);
        System.out.println("Karenin Alanı    = " + kAlan);
        System.out.println("-".repeat(30));

        int dAlan = alanHesapla(dikdortgeninUzunKenari, dikdortgeninKisaKenari);
        System.out.println("Dairenin Alanı   = " + dAlan);
        System.out.println("-".repeat(30));

        int kCevre = cevreHesapla(kareninKenari, kareninKenari);
        System.out.println("Karenin Çevresi  = " + kCevre);
        System.out.println("-".repeat(30));

        int dCevre = cevreHesapla(dikdortgeninUzunKenari, dikdortgeninKisaKenari);
        System.out.println("Dairenin Çevresi = " + dCevre);
        System.out.println("-".repeat(30));
    }
    public static int alanHesapla(int k1, int k2) {
        return k1 * k2;
    }
    public static int cevreHesapla(int k1, int k2) {
        return 2 * (k1 + k2);
    }
}
