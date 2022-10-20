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

          alanHesapla();
          cevreHesapla();





    }
    public static void alanHesapla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz : ");
        int k1 = scan.nextInt();
        System.out.println("Dikdörtgenin uzun kenarını giriniz : ");
        int k2 = scan.nextInt();
        System.out.println("Karenin kenarını girniz : ");
        int kenar = scan.nextInt();


        System.out.println("Dikdörtgenin Alanı :"+k1*k2);
        System.out.println("karenin Alanı : "+kenar*kenar);



    }
    public static void cevreHesapla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz : ");
        int k1 = scan.nextInt();
        System.out.println("Dikdörtgenin uzun kenarını giriniz : ");
        int k2 = scan.nextInt();
        System.out.println("Karenin kenarını girniz : ");
        int kenar = scan.nextInt();

        System.out.println("Dikdörtgenin çevresi : "+2*(k1+k2));
        System.out.println("Karenin çevresi :" +5*kenar);

    }

}















