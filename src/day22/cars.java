package day22;

import java.util.Scanner;

public class cars {
    public static void main(String[] args) {
       /* String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

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


        Not 2: Ödev IntelliJ'de yapılıp, Github'a push edilecek ve sonrasnda pullrequest yapılacaktır.*/

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        System.out.println("----MEVCUT ARABALARIMIZ---");
        for (int i = 0; i <= 6; i++) {
            System.out.println((i + 1) + " . Araba : " + (cars[i]));
        }
        Scanner input = new Scanner(System.in);
        int secim;
        do {
        System.out.println("kaç numaralı arabayı seçtiniz? ");
         secim = input.nextInt();
        switch (secim) {
            case 1, 2, 3 -> {
                int priceRange = (40000 - 20000) + 1;
                double price = Math.round(20000 + (Math.random() * priceRange));
                System.out.printf("istediğiniz araba : %s, %5.2f lira.", cars[secim - 1], price);
            }
            case 4, 5 -> {
                int priceRange = (80000 - 50000) + 1;
                double price = Math.round(50000 + (Math.random() * priceRange));
                System.out.printf("istediğiniz araba : %s, %5.2f lira.", cars[secim - 1], price);
            }
            case 6, 7 -> {
                int priceRange = (150000 - 100000) + 1;
                double price = Math.round(100000 + (Math.random() * priceRange));
                System.out.printf("istediğiniz araba : %s, %5.2f lira.", cars[secim - 1], price);
            }
            default -> System.out.println("yanlış seçim yaptınız tekrar deneyiniz: ");
        }
        }  while (secim>7);
    }
}


