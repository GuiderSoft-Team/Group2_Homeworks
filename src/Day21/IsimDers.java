package Day21;

public class IsimDers {
    public static void main(String[] args) {
        String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe",
                "Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

        System.out.println("Ad\t\tBölüm".toUpperCase());

        for (int i = 0; i <data.length; i++) {
            if (i%2==0){
                String ad=data[i];
                System.out.print(ad);
                System.out.print("\t");

            }if (i%2==1){
                String bolum=data[i];
                System.out.println(bolum);
            }
        }

    }
}
