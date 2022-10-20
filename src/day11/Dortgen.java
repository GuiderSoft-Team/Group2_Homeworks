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
        Scanner input=new Scanner(System.in);
        System.out.print("Karenin Kenarını Giriniz: ");
        int kenar1=input.nextInt();
        System.out.print("Dikdörtgenin kısakenarı giriniz: ");
        int kisaKenar=input.nextInt();
        System.out.print("Dikdörtgenin uzunkenarı giriniz: ");
        int uzunKenar=input.nextInt();
        int kareAlan=alanHesapla(kenar1,kenar1);
        int dikdortgenAlan=alanHesapla(kisaKenar,uzunKenar);
        int kareCevre=cevreHesapla(kenar1,kenar1);
        int dikdortgenCevre=cevreHesapla(kisaKenar,uzunKenar);
        System.out.println("Karenin Alanı: "+kareAlan);
        System.out.println("Karenin Cevresi: "+kareCevre);
        System.out.println("Dikdörtgenin Alanı: "+dikdortgenAlan);
        System.out.println("Dikdörtgenin Cevresi: "+dikdortgenCevre);


    }
    public static int alanHesapla(int k1, int k2){
        return k1*k2;
    }
    public static int cevreHesapla(int k1, int k2){
        return 2*(k1+k2);
    }


}
