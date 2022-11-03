package day21;

public class homeworkArraysString {
    public static void main(String[] args) {
       /* String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik",
       "Feraye","Biyoloji","Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar",
       "Hasan","Fizik","Sezgin","Biyoloji" };
        Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik
        biçiminde ekran çıktısı veren bir Java programı yazınız.
        Not: GitHub'da Groups homework üzerinden gönderiniz.*/
        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik",
                "Feraye", "Biyoloji", "Cengiz", "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar",
                "Hasan", "Fizik", "Sezgin", "Biyoloji"};
        System.out.println("ADI        BÖLÜMÜ");
        System.out.println(("************"));
        for (int i = 0; i < data.length; i+=2) {
            System.out.println(data[i]+"  "+data[i+1]);
            }
        }
    }
