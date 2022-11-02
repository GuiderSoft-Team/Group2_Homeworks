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
                System.out.print("Bir kare kenar ölçüsü belirleyin:");
                int kenar = input.nextInt();
                Scanner i = new Scanner(System.in);
                System.out.print("Dikdörten kısa kenar ölçüsü belirleyin:");
                int kisaKenar = i.nextInt();
                Scanner u = new Scanner(System.in);
                System.out.print("Dikdörten uzun kenar ölçüsü belirleyin:");
                int uzunKenar = u.nextInt();
                int k1 = kenar;
                int k2 = 0;
                int kareAlan =alanHesapla(k1, k2);
                int kareCevre = cevreHesapla(k1, k2);
                System.out.println("Kare alanı " + kareAlan);
                System.out.println("Kare Çevresi " + kareCevre);
                k1 = kisaKenar;
                k2 = uzunKenar;
                int dikDortgenAlan =alanHesapla(k1, k2);
                int dikdortgenCevre = cevreHesapla(k1, k2);
                System.out.println("Dikdörtgen alanı " + dikDortgenAlan);
                System.out.println("Dikdörtgen Çevresi " + dikdortgenCevre);
                System.out.println("Sonuçta Toplam Alan=" + (+kareAlan + dikDortgenAlan));
                System.out.println("TOPLAM ÇEVRE=" + (kareCevre + dikdortgenCevre));
            }
            public static int alanHesapla(int k1, int k2) {
                if (k2 == 0)
                    return k1 * k1;
                else
                    return k1 * k2;

            }
            public static int cevreHesapla(int k1, int k2) {
                if (k2 == 0)
                    return 4* k1;
                else
                    return 2*(k1+k2);
    }
}
