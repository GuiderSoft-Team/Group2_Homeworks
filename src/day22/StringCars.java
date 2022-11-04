package day22;

import java.util.Random;
import java.util.Scanner;

public class StringCars {
    public static void main(String[] args) {

        /*  String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
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
        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int rastFiyat;

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + "." + cars[i]);
        }
        System.out.print("Araba seciniz: ");
        int secilenAraba = input.nextInt();
        if (secilenAraba == 1 || secilenAraba == 2 || secilenAraba == 3) {
            rastFiyat = random.nextInt(20000, 40000);
            System.out.printf("sectiginiz araba %s, fiyati %d. Iyi gunlerde kullaniniz. ", cars[secilenAraba - 1], rastFiyat);
        } else if (secilenAraba == 4 || secilenAraba == 5) {
            rastFiyat = random.nextInt(50000, 80000);
            System.out.printf("sectiginiz araba %s, fiyati %d. Iyi gunlerde kullaniniz. ", cars[secilenAraba - 1], rastFiyat);
        } else if (secilenAraba == 6 || secilenAraba == 7) {
            rastFiyat = random.nextInt(100000, 150000);
            System.out.printf("sectiginiz araba %s, fiyati %d. Iyi gunlerde kullaniniz. ", cars[secilenAraba - 1], rastFiyat);
        } else {
            System.out.println("Yanlis sayi girdiniz.");
        }
    }
}
