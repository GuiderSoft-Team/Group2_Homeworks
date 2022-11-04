package day22;

import java.util.Scanner;

public class carsPrice {
    public static void main(String[] args) {
        /*ttString[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
        1. Honda
        2. Toyota
        şeklinde olacaktır.

        Listenin en altında kullanıcıdan seçim yapması istenilecektir.

        Kullanıcının seçtiği arabaya uygun fiyat;
        Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
        Şeklinde gösterilecektir.

        Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
                Honda – Toyota – Nissan (Random price between 20000 and 40000)
        BMW-Mercedes(Random price between 50000 and 80000)
        Porsche - Ferrari(Random price between 100000 and 150000)*/

        System.out.println("Lütfen bir araba modeli seçin.");
        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        int price;
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + "- " + cars[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Seçim: ");
        int secim = input.nextInt();
        System.out.println("Seçiminiz: " + cars[secim - 1]);
        if (secim >=1 & secim <= 3) {
            price = (int) (Math.round(Math.random() * 20000)) + 20000;
        } else if (secim >=4 & secim <=5){
            price = (int) (Math.round(Math.random() * 30000)) + 50000;
        }else{
            price = (int) (Math.round(Math.random() * 50000)) + 100000;
        }
        System.out.printf("Seçtiğiniz araba %s, Fiyatı=%d, İyi Günlerde Kullanın.", cars[secim - 1], price);
      }
}
