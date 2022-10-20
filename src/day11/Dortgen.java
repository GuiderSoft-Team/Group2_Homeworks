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
        System.out.println("Karenin kenarini giriniz");
        int kenar= input.nextInt();
        System.out.println("Diktörtgen icin kisa kenari girin");
        int kisaKenar= input.nextInt();
        System.out.println("Diktörgen icin uzun kenari girin");
        int uzunKenar=input.nextInt();
        int kareninAlani=alanHesapla(kenar);
        int diktortgeninAlani=alanHesapla(kisaKenar,uzunKenar);
        int kareninCevreHesapla=cevreHesapla(kenar);
        int diktortgeninCevreHesapla=cevreHesapla(kisaKenar,uzunKenar);
        System.out.println("Toplam alan = "+(kareninAlani+diktortgeninAlani));
        System.out.println("Toplam cevre = "+(kareninCevreHesapla+diktortgeninCevreHesapla));
    }

    public static int alanHesapla(int k1,int k2){
        return k1*k2;
    }
    public static int alanHesapla(int k){
        return k*k;
    }
    public static int cevreHesapla(int k){
        return 4*k;
    }
    public static int cevreHesapla(int k1,int k2){
        return (k1+k2)*2;
    }
}
