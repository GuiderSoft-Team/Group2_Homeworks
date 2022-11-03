package day21;

public class TaskArray {
    public static void main(String[] args) {



        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji",
                "Cengiz", "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik",
                "Sezgin", "Biyoloji"};

        System.out.println("\tAdı-----------------Bölümü");


        for (int i = 0; i < data.length; i += 2) {
            System.out.printf("\t%s\t\t\t\t%s",data[i],data[i+1]);
            System.out.println();
        }

    }
}







