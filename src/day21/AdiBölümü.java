package day21;

import java.sql.SQLOutput;

public class AdiBölümü {
    public static void main(String[] args) {

        String[] data={"Ahmet","Fizik","Sengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe",
                "Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji"};

        System.out.println("Adi\t\t Bölümü");
        System.out.println("----\t -----");

        for (int i = 0; i < 18; i++) {
            System.out.print(data[i]+"\t ");
            if (i%2!=0){
                System.out.println();

            }

        }

    }
}
