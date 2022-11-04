package day21;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        /*
        String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe",
        "Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

            Yukarıdaki dizi verildiğine göre;
            Adı Bölümü
            Ahmet Fizik

         biçiminde ekran çıktısı veren bir Java programı yazınız.

         */

        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji", "Cengiz", "Felsefe",
                "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};

        System.out.println("Adı  Bölümü");


        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " "+data[i=i+1]+" ");


        }


    }
}


        




