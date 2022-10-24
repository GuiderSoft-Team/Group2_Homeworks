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
        int Kenar, KisaKenar,UzunKenar;

        System.out.print("Karenin kenarını Giriniz :");
       Kenar = input.nextInt();

        System.out.print("Dikdörtgenin Kısa Kenarını Giriniz :");
        KisaKenar = input.nextInt();
        System.out.print("Dikdörtgenin Uzun Kenarını Giriniz :");
        UzunKenar = input.nextInt();
        int D_Alan=AlanHesapla(KisaKenar,UzunKenar);
        int K_Alan=AlanHesapla(Kenar,Kenar);
        int D_Cevre=CevreHesapla(KisaKenar,UzunKenar);
        int K_Cevre=CevreHesapla(Kenar,Kenar);
        int toplamAlan=K_Alan+D_Alan;
        int toplamCevre=K_Cevre+D_Cevre;

        System.out.println("Karenin Alanı : "+K_Alan);
        System.out.println("Karenin Çevresi : "+K_Cevre);

        System.out.println("Dikdörgenin Alanı : "+D_Alan);
        System.out.println("Dikdörgenin Çevresi : "+D_Cevre);
        System.out.println("Alanlar Toplamı ="+toplamAlan);
        System.out.println("Çevreler Toplamı ="+toplamCevre);


    }
    public static int AlanHesapla(int KisaKenar,int UzunKenar){

        return KisaKenar*UzunKenar;
    }
    public static int CevreHesapla(int KisaKenar,int UzunKenar){

        return 2*(KisaKenar+UzunKenar);
     }
    }

