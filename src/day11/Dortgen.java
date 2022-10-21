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
        System.out.print("Karenin kenarini giriniz: ");
        int kenar = input.nextInt();
        System.out.print("Dikdorgenin uzun kenarini giriniz: ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdortgenin kisa kenarini giriniz: ");
        int uzunKenar = input.nextInt();

        int kareAlan = alanHesaplama(kenar,kenar);
        System.out.println("Karenin alani: "+ kareAlan);
        int dikdortgenAlan = alanHesaplama(kisaKenar,uzunKenar);
        System.out.println("Dikdortgenin alani: "+ dikdortgenAlan);

        int kareCevre = cevreHesaplama(kenar,kenar);
        System.out.println("Karenin cevresi: "+ kareCevre);
        int dikdortgenCevre = cevreHesaplama(kisaKenar,uzunKenar);
        System.out.println("Dikdortgenin cevresi: "+ dikdortgenCevre);


    }
    public static int alanHesaplama(int k1, int k2){
      return k1*k2 ;
    }
    public static int cevreHesaplama(int k1, int k2){
        return 2*(k1+k2);
    }
}
