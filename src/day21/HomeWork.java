package day21;

public class HomeWork {
    public static void main(String[] args) {
        String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe",
                "Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        System.out.println("Adı \tBölümü");
        System.out.println();
        for (int i = 0; i < 17; i+=2) {
            System.out.println(data[i]+"\t"+ data[i+1]);
        }


       /* Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik

        biçiminde ekran çıktısı veren bir Java programı yazınız.

        Not: GitHub'da Groups homework üzerinden gönderiniz.*/
    }
}