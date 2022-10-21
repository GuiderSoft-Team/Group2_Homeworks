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
        System.out.print("Karenin kenarı= ");
        int kenar = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarı= ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarı= ");
        int uzunKenar = input.nextInt();

        int kareninAlani = alanHesapla(kenar, kenar);
        int dikdortgeninAlani = alanHesapla(kisaKenar, uzunKenar);
        System.out.println("Karenin Alanı = " +kareninAlani);
        System.out.println("Dikdörtgenin Alanı = " +dikdortgeninAlani);

        int kareninCevresi = cevreHesapla(kenar,kenar);
        int dikdortgeninCevresi = cevreHesapla(kisaKenar, uzunKenar);
        System.out.println("Karenin Çevresi =" +kareninCevresi);
        System.out.println("Dikdörtgenin Çevresi =" +dikdortgeninCevresi);

        System.out.println("Toplam Alan =" + (kareninAlani + dikdortgeninAlani));
        System.out.println("Toplam Çevre =" + (kareninCevresi + dikdortgeninCevresi));

    }
        public static int alanHesapla(int k1, int k2){
            return k1*k2;
        }

        public static int cevreHesapla(int k1, int k2){
            return 2*(k1+k2);
        }
    }



