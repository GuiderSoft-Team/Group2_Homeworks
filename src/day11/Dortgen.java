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

        System.out.print("Karenin kenar uzunlugunu giriniz : ");
        int kenar = input.nextInt();
        System.out.print("Dikdörtgenin kisa kenarini giriniz : ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarini giriniz : ");
        int uzunKenar = input.nextInt();

        int alanKare=alanHesapla(kenar,kenar);
        int alanDikdortgen=alanHesapla(kisaKenar,uzunKenar);

        int cevreKare=cevreHesapla(kenar,kenar);
        int cevreDikdortgen=cevreHesapla(kisaKenar,uzunKenar);

        System.out.println("Karenin alani = "+alanKare);
        System.out.println("Dikdörtgenin alani = "+alanDikdortgen);

        System.out.println("Karenin cevresi = "+cevreKare);
        System.out.println("Dikdörtgenin cevresi = "+cevreDikdortgen);



    }

    public static int alanHesapla(int k1, int k2){

        return k1*k2;

    }

    public static int cevreHesapla(int k1, int k2){

        return 2*(k1+k2);
    }
}
