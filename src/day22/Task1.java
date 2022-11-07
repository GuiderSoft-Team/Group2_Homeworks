package day22;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
         /*
        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
        1. Honda
        2. Toyota
        ...     şeklinde olacaktır.
        Listenin en altında kullanıcıdan seçim yapması istenilecektir.
        Kullanıcının seçtiği arabaya uygun fiyat;
              "Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın."  şeklinde gösterilecektir.
        Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
        Honda – Toyota – Nissan (Random price between 20000 and 40000)
        BMW-Mercedes(Random price between 50000 and 80000)
        Porsche - Ferrari(Random price between 100000 and 150000)
        Not 2: Ödev IntelliJ'de yapılıp, Github'a push edilecek ve sonrasnda pullrequest yapılacaktır.
         */
        Random rndm = new Random();

        String[] arabalar = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        for (int i = 0; i < arabalar.length; i++) {

            System.out.printf("%d. %s\n", i + 1, arabalar[i]);
        }
        System.out.println("0. Çıkış.");

        System.out.print("Araç seçiminizi giriniz [1-7] : ");

        Scanner scan = new Scanner(System.in);

        int secim = scan.nextInt();

        int fiyat = switch (secim) {
            case 1, 2, 3 -> rndm.nextInt(20000, 40000);
            case 4, 5 -> rndm.nextInt(50000, 80000);
            case 6, 7 -> rndm.nextInt(100000, 150000);
            default -> 0;
        };

        if (secim > 0 & secim < 8) {
            System.out.printf("Seçtiğiniz araba %s, fiyatı %d. İyi günlerde kullanın.\n", arabalar[secim - 1], fiyat);

        } else if(secim==0){
            System.out.println("Program sonlandırıldı.");

        } else {
            System.out.println("Hatalı seçim yaptınız.");
        }


    }





    }

