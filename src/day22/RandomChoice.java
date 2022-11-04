package day22;

import java.util.Scanner;
import java.util.Random;

public class RandomChoice {
    public static void main(String[] args) {
        /*String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

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
        Porsche - Ferrari(Random price between 100000 and 150000)
        Not 2: Ödev IntelliJ'de yapılıp, Github'a push edilecek ve sonrasnda pullrequest yapılacaktır.*/

        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1)+"."+ cars[i]);
        }
        Random randomCars= new Random();
        int aSec= randomCars.nextInt(20000,40000);
        int bSec= randomCars.nextInt(50000,80000);
        int cSec= randomCars.nextInt(100000,150000);

        Scanner input = new Scanner(System.in);
        System.out.print("Seçeceğiniz Aracın Sıra Numarasını Girin:");

        for (int j = 1; j < cars.length; j++) {
            j = input.nextInt();

            if (j<3){
                System.out.printf("Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.", cars[j-1], aSec);
            } else if (j>2 & j<5) {
                System.out.printf("Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.", cars[j-1], bSec);
            }
            else if (j>4 & j<cars.length+1 ){
                System.out.printf("Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.", cars[j-1], cSec);
            }
            else {
                System.out.println("Dizin sayısı dışında bir sayı girdiniz ");
            }
        }

    }
}
