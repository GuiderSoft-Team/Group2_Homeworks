package day21;

public class TaskArray {
    public static void main(String[] args) {
        //TODO:String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz",
        // "Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        //Yukarıdaki dizi verildiğine göre;
        //Adı    Bölümü
        //Ahmet  Fizik
        //biçiminde ekran çıktısı veren bir Java programı yazınız.
        //Not: GitHub'da Groups homework üzerinden gönderiniz
/*        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji", "Cengiz",
                "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};


        for (int i = 0; i < data.length; i += 2) {
            System.out.printf("\t%s\n", data[i]);


        }
        for (int j = 1; j < data.length; j += 2) {
            System.out.printf("\t%s\n", data[j], "\n");*/
        String[ ] data={"Ahmet","Fizik","Sengul","Kimya","Hakan","Matematik","Feraye","Biyoloji",
                "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        System.out.println("\tAdi-------------Bolumu");


            for (int i = 0; i < data.length; i += 2) {
               // System.out.print("\t"+data[i] + "\t\t\t\t" + data[i + 1]);
               // System.out.printf("\t %s\t\t\t%s",data[i],data[i+1]);

                System.out.println("\t"+data[i]+"\t\t\t"+data[i+1]);
        }



    }
        }










