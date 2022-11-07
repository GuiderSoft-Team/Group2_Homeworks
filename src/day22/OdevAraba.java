package day22;

import java.util.Random;
import java.util.Scanner;

public class OdevAraba {
    public static void main(String[] args) {
                /*
            String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
            dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
            1. Honda
            2. Toyota
                ...     şeklinde olacaktır.
            Listenin en altında kullanıcıdan seçim yapması istenilecektir.
            Kullanıcının seçtiği arabaya uygun fiyat;
            Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
            Şeklinde gösterilecektir.
            Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
            Honda – Toyota – Nissan (Random price between 20000 and 40000)
            BMW-Mercedes(Random price between 50000 and 80000)
            Porsche - Ferrari(Random price between 100000 and 150000)
         */
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        String[] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        System.out.println("Arabaların Listesi");
        System.out.println("-".repeat(17));

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1)+". "+cars[i]);
        }
        System.out.print("Seçiminiz : ");
        int secim=input.nextInt();
        int fiyat=0;
        switch (secim){
            case 1:
            case 2:
            case 3:fiyat= random.nextInt(20000, 40000);
                break;
            case 4:
            case 5:fiyat= random.nextInt(50000, 80000);
                break;
            case 6:
            case 7:fiyat= random.nextInt(100000, 150000);
        }
        if (secim>0&secim<=7){
            System.out.printf("Sectiğiniz araba %s, fiyati %d. İyi günlerde kullanınn. ",cars[secim-1],fiyat);
        }else {
            System.out.println("Yanlış seçim yaptınız");
        }
    }
}
