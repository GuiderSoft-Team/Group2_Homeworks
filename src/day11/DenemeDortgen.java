package day11;

import java.util.Scanner;

public class DenemeDortgen {
    public static void main(String[] args) {
        //TODO DORTGENİN ALANI VE CEVRESİ
        System.out.println("klavyeden 3 adet gis yapınız");
        Scanner input=new Scanner(System.in);
        System.out.println("Karenin kenarını giriniz");
        int kKenar= input.nextInt();
        System.out.println("Dikdötgenin kısa kenarını giriniz");
        int dKKenar= input.nextInt();
        System.out.println("Dikdötgenin uzun kenarını giriniz");
        int dUKenar= input.nextInt();

      int alanK=alanHesapla(kKenar,kKenar);
      int cevreK=cevreHeapla(kKenar,kKenar);
      int alanD=alanHesapla(dUKenar,dKKenar);
      int cevreD=cevreHeapla(dUKenar,dKKenar);

      int toplamalan=alanD+alanK;
        System.out.println("alan toplamları:"+(alanD+alanK));
      int toplamcevre=cevreD+cevreK;
        System.out.println("cevre toplamları:"+(cevreK+cevreK));

       //System.out.printf("Toplam alan: %d\n Toplam Cevre: %d",
              //  toplamalan,toplamcevre);



        }
        public static int alanHesapla(int k1,int k2){
        return k1*k2;
        }
public static int cevreHeapla(int k1,int k2){

    return 2*(k1+k2);
}
    }

