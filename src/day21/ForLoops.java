package day21;

public class ForLoops {
    public static void main(String[] args) {
        String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz",
                "Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

        System.out.println("Adı\t\tBölümü");

        for (int i = 0; i < data.length; i+=2) {
            System.out.println(data[i]+"\t\t"+ data[i+1]);
        }



    }
}
