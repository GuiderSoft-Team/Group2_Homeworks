package day22;

import java.util.Scanner;

public class TaskArac {
    public static void main(String[] args) {
        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + ". " + cars[i]);
        }
        System.out.print("Araç seçiniz: ");
        int secim = new Scanner(System.in).nextInt();

        double price1 = Math.round(20000 + 20000 * Math.random());
        double price2 = Math.round(50000 + 30000 * Math.random());
        double price3 = Math.round(100000 + 50000 * Math.random());

        if (secim < 3) {
            System.out.printf("Seçtiğiniz araç: %s Fiyatı: %5.0f'dir. İyi günlerde kullanın.", cars[secim - 1], price1);
        } else if (secim >= 3 & secim < 5) {
            System.out.printf("Seçtiğiniz araç: %s Fiyatı: %5.0f'dir. İyi günlerde kullanın.", cars[secim - 1], price2);
        } else if (secim >= 5 & secim < 7) {
            System.out.printf("Seçtiğiniz araç %s dir. Fiyatı %5.0f dir. İyi günlerde kullanın.", cars[secim - 1], price3);
        } else System.out.println("Geçersiz seçim yaptınız.");
        }






    }

