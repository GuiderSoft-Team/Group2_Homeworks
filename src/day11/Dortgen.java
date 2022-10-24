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
        System.out.print("Kareninin kenarini giriniz. ");
        int kenar = input.nextInt();
        System.out.print("Dikdortgenin uzun kenarini giriniz. ");
        int uzun = input.nextInt();
        System.out.print("Dikdortgenin kisa kenarini giriniz. ");
        int kisa = input.nextInt();
        int alan1=alanHesapla(kenar,kenar);
        int alan2=alanHesapla(uzun,kisa);

        int cevre1=cevreHesapla(kenar,kenar);
        int cevre2=cevreHesapla(kisa,uzun);
        System.out.println("TOPLAM ALAN = "+(alan2+alan2));
        System.out.println("TOPLAM CEVRE= "+(cevre1+cevre2));


    }
    public static int alanHesapla(int kenar1,int kenar2){
        return kenar1*kenar2;
    }
    public static int cevreHesapla(int kenar1,int kenar2){
        return 2*kenar1*kenar2;
    }
}