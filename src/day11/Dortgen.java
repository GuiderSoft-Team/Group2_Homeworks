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
        System.out.print("Karenin kenar bilgisini giriniz : ");
        int kenar = input.nextInt();
        System.out.print("Kisa kenar bilgisi giriniz : ");
        int kisaKenar= input.nextInt();
        System.out.print("Uzun kenar bilgisi giriniz : ");
        int uzunKenar = input.nextInt();
        int kareAlan=alanHesapla(kenar*kenar);
        System.out.println("Karenin alani : "+kareAlan);
        int dikdortgenAlan=alanHesapla(kisaKenar*uzunKenar);
        System.out.println("Dikdortgenin alani : "+dikdortgenAlan);
        int kareCevre=cevreHesapla(4*kenar);
        System.out.println("Karenin cevresi : "+kareCevre);
        int dikdortgenCevre=cevreHesapla(2*(uzunKenar+kisaKenar));
        System.out.println("Dikdortgenin cevresi : "+dikdortgenCevre);
    }
    public static int alanHesapla(int kenar){
        return kenar*kenar;
    }
    public static int cevreHesapla(int kenar) {
        return 4 * kenar;
    }
}
