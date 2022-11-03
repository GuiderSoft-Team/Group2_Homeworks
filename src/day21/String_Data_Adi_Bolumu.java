package day21;

public class String_Data_Adi_Bolumu {
    public static void main(String[] args) {
        /*
        String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji",
        "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

        Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik
        biçiminde ekran çıktısı veren bir Java programı yazınız.

        Not: GitHub'da Groups homework üzerinden gönderiniz.
         */

        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji",
                "Cengiz", "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};

        System.out.println("ADI\t\tBÖLÜMÜ");

        for (int i = 0; i < data.length / 2; i++) {//Dizideki eleman sayısının yarısı kadar dönmesini istiyoruz.

            System.out.println(data[2 * i] + "\t" + data[(2 * i + 1)]);
            //index numaraları 0-1, 2-3, ... şeklinde çift ve çiftin ardışığı şeklinde olduğundan 2*i ve (2*i+1) seçtik.
        }

    }
}
