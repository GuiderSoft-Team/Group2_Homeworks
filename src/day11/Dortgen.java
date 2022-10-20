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
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen karenin kenarını giriniz: ");
        int kareK=input.nextInt();
        System.out.print("lütfen dikdörtgenin kısa kenarını giriniz: ");
        int dikKk=input.nextInt();
        System.out.print("lütfen dikdörtgenin uzun kenarını giriniz: ");
        int dikUk=input.nextInt();
                int alanlarTop=alanHesapla(kareK,kareK)+alanHesapla(dikKk,dikUk);
                int cevreTop=cevreHesapla(kareK,kareK)+cevreHesapla(dikUk,dikKk);
        System.out.println("kare ve dikdortgenin alanları toplamı:  "+alanlarTop);
        System.out.println("kare ve dikdortgenn cevreleri toplamı:   "+cevreTop);
        }
        public static int alanHesapla(int k, int k1){
        return k*k1;
        }
        public static int cevreHesapla(int k,int k1){
        return (k+k1)*2 ;
        }
        }
