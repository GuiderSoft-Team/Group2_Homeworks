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


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin kenarini giriniz.");
        int kenar1= scan.nextInt();
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz.");
        int uzunKenar= scan.nextInt();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz.");
        int kisaKenar= scan.nextInt();

        int alanA=alanHesapla(kenar1);
        System.out.println("Karenin Alani"+alanA);
        int alanB=alanHesapla(kisaKenar*uzunKenar);
        System.out.println("Dikdortgenin Alani"+alanB);

        int cevreX=cevreHesapla(kenar1);
        System.out.println("KareninCevresi"+cevreX);
        int cevreY=cevreHesapla(kisaKenar*uzunKenar);
        System.out.println("DikdortgeninCevresi"+cevreY);

    }
      public static int alanHesapla(int kenar1){
       int kareAlan=kenar1;
      return kenar1;

}
  public static int cevreHesapla(int kenar) {
        return 0;
  }


  }