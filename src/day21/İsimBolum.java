package day21;

public class İsimBolum {
    public static void main(String[] args) {
        /*
            String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji",
            "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

            Yukarıdaki dizi verildiğine göre;
            Adı Bölümü
            Ahmet Fizik

            biçiminde ekran çıktısı veren bir Java programı yazınız.
         */
        String[] isim={"Ahmet","Sengul","Hakan","Feraye","Cengiz","Salih","Sezen","Hasan","Sezgin", };
        String[] bolum={"Fizik","Kimya","Matematik","Biyoloji","Felsefe","Elektronik","Bilgisayar","Fizik","Biyoloji"};

        System.out.println(" ADI\t\tBOLUMU ");
        System.out.println();

        for (int i = 0; i < isim.length; i++) {
            System.out.println(isim[i]+"\t\t"+bolum[i]);
        }

    }
}
