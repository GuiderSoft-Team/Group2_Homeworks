package day21;

public class Task1 {
    public static void main(String[] args) {
        //String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan",
        //"Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih",
        //"Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        //
        //Yukarıdaki dizi verildiğine göre;
        //Adı Bölümü
        //Ahmet Fizik
        //
        //biçiminde ekran çıktısı veren bir Java programı yazınız.
        //Not: GitHub'da Groups homework üzerinden gönderiniz.
        System.out.println("Adi\t\tBölümü\n");
        String[] data={"Ahmet","Fizik","Şengül","Kimya","Hakan",
                "Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih",
                "Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji"};
        for (int i = 0; i < data.length-1; i+=2) {
            System.out.println(data[i]+"\t"+data[i+1]);
        }


    }
}
