package day021;

public class Task {
    public static void main(String[] args) {
        //String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji",
        // "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        // Yukarıdaki dizi verildiğine göre;
        // Adı Bölümü
        // Ahmet Fizik
        // biçiminde ekran çıktısı veren bir Java programı yazınız.

        String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        System.out.println("Adı"+"\t\t\t"+"Bölümü");
        for (int i = 0; i <data.length ; i++) {
            if(i%2==0){
                System.out.printf(data[i]+"\t");
            }
            else {
                System.out.printf("\t"+data[i]);
                System.out.println();
            }

        }
    }

}
