package day22;

import java.util.Scanner;

public class ArabaFiyat {
    public static void main(String[] args) {
       
        /* dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
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
        Porsche - Ferrari(Random price between 100000 and 150000)*/


        Scanner input = new Scanner(System.in);

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        int secim;
        System.out.println(" ARABALARIMIZ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + "." + cars[i]);
        }

        do {
            System.out.print("Lütfen Seçim Yapınız:");
            secim = input.nextInt();
            switch (secim) {
                case 1, 2, 3 -> {
                    double fiyat = (Math.round(Math.random() * 20000)) + 20000;
                    System.out.printf("Seçtiğiniz Araba %s fiyatı: %5.2f", cars[secim - 1], fiyat);
                }
                case 4, 5 -> {
                    double fiyat = (Math.round(Math.random() * 30000)) + 50000;
                    System.out.printf("Seçtiğiniz Araba %s fiyatı: %5.2f", cars[secim - 1], fiyat);
                }
                case 6, 7 -> {
                    double fiyat = (Math.round(Math.random() * 50000)) + 100000;
                    System.out.printf("Seçtiğiniz Araba %s fiyatı: %5.2f", cars[secim - 1], fiyat);
                }
                default -> System.out.println("Yanlış seçim yaptınız, Tekrar deneyin!");

            }
        }while (secim>7);



    }

}
