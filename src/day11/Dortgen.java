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

        Scanner input= new Scanner(System.in);

        System.out.print("Karenin kenarını giriniz: ");
        int kenar=input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int kisaKenar=input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int uzunKenar=input.nextInt();

        int alan1=alanHesapla(kenar,kenar);
        System.out.println("Karenin alanı: " +alan1);
        int alan2=alanHesapla(kisaKenar,uzunKenar);
        System.out.println("Dikdörtgenin alanı: " +alan2);

        int cevre1=cevreHesapla(kenar,kenar);
        System.out.println("Karenin çevresi: " +cevre1);
        int cevre2=cevreHesapla(kisaKenar,uzunKenar);
        System.out.println("Dikdörtgenin çevresi:" +cevre2);

        System.out.println("Kare ve dikdörtgen toplam alanı: " +(alan1+alan2));
        System.out.println("Kare ve dikdörtgenin toplam çevresi: " +(cevre1+cevre2));


    }
    public static int alanHesapla (int k1, int k2)
    {
        return k1*k2;
    }
        public static int cevreHesapla(int k1,int k2){
            return 2 * (k1 + k2);
        }

    }

       Scanner input=new Scanner(System.in);
        System.out.print("Kare için kenar : ");
        int kenar = input.nextInt();
        System.out.print("Dikdörtgen için Kısa keanr : ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdörtgen için Uzun kenar : ");
        int uzunKenar= input.nextInt();

        int kareninAlani=alanHesapla(kenar,kenar);
        int kareninCevresi=cevreHesapla(kenar,kenar);

        int dikdortgeninAlani=alanHesapla(kisaKenar,uzunKenar);
        int dikdortgeninCevresi=cevreHesapla(kisaKenar,uzunKenar);

        int toplamAlan=kareninAlani+dikdortgeninAlani;
        int toplamCevre=kareninCevresi+dikdortgeninCevresi;

        System.out.println("Toplam Alan = "+toplamAlan);
        System.out.println("Toplam Çevre = "+toplamCevre);


    }

    public static int alanHesapla(int k1,int k2){
        return k1*k2;
    }

    public static int cevreHesapla(int k1,int k2){
        return 2*(k1+k2);
    }

}

