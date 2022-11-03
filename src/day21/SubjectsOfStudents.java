package day21;

public class SubjectsOfStudents {
    public static void main(String[] args) {
        /*String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik",
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

        System.out.println("Adı\t\tBölümü");
        System.out.println(("-".repeat(15)));
//
//        for (int i = 0; i < data.length ; i+=2) {
//            System.out.print(data[i] + "\t" + data[i+1]);
//            System.out.println();


        for (int i = 0; i < data.length; i+=2) {
            for (int j = 1; j < data.length; j+=2)
            {
                if (j==(i+1)){
                    System.out.println(data[i] + "\t" + data[j]);
                }
            }
        }
    }
}
