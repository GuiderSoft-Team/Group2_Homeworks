package day21;

public class ForEachHW {
    public static void main(String[] args) {

                /*Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik

        biçiminde ekran çıktısı veren bir Java programı yazınız.*/

        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji", "Cengiz", "Felsefe",
                "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};

        for (int i = 0; i < data.length; i += 2) {
            if (i == 0) {
                System.out.println("Name\tClass");
            }
            System.out.println(data[i] + "\t" + data[i + 1]);
        }

    }
}