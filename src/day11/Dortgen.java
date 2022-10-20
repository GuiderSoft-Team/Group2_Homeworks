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
        System.out.println("Karenin kenarını giriniz : ");
        int squareLenght = input.nextInt();
        System.out.println("Dikdörtgenin kısa kenarını giriniz : ");
        int rectShortLenght = input.nextInt();
        System.out.println("Dikdörtgenin uzun kenarını giriniz :");
        int rectLongLenght = input.nextInt();

       int toplamAlan= alanHesapla(squareLenght)+alanHesapla(rectLongLenght,rectShortLenght);
        System.out.println("Alanlar toplamı : "+toplamAlan);

        int toplamCevre=cevreHesapla(squareLenght)+cevreHesapla(rectLongLenght,rectShortLenght);
        System.out.println("Çevreler Toplamı : " +toplamCevre);



    }

    public static int alanHesapla(int a) {
        return a * a;
    }                                               //Overloading yaparak çözmeye çalıştım :)

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
