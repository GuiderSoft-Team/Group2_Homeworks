import java.util.Scanner;

public class AysegulKurt_AdBolum {
    public static void main(String[] args) {
  /*
        Task
         String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

        Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik

        biçiminde ekran çıktısı veren bir Java proramı yazınız.

    */

        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji",
        "Cengiz", "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};

        System.out.println("Adi\t\tBolumu:");

        for (int i = 0; i < data.length; i++) {





            System.out.println(data[i]+ " "+data[i=i+1]);


        }
    }
}

