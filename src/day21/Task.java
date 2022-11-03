package day21;

public class Task {
    public static <i> void main(String[] args) {
       /* String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

        Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik

        biçiminde ekran çıktısı veren bir Java programı yazınız.

        Not: GitHub'da Groups homework üzerinden gönderiniz.
        */

        String[ ] ogrenci={"Ahmet","Şengül","Hakan","Feraye","Cengiz","Salih","Sezen","Hasan","Sezgin" };
        String[] bolum={"Fizik","Kimya","Matematik","Biyoloji","Felsefe","Elektronik","Bilgisayar","Fizik","Biyoloji" };
        System.out.println(" ADI\t\tBÖLÜMÜ");
        System.out.println("-".repeat(20));
        for (int i = 0; i < 9; i++) {

            System.out.print((i+1)+". "+ ogrenci[i] +"\t");
            System.out.println(bolum[i] );

        }
        System.out.println();
    }
}
