package day22;

import java.util.Random;
import java.util.Scanner;

public class TaskCar {
    public static void main(String[] args) {

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        Random rnd = new Random();
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i]);
        }
        System.out.print("Lütfen istediginiz arabayi secin: ");
        Scanner input = new Scanner(System.in);
        String secim = input.next();
        int fiyat = 0;
        boolean flag = true;
        for (int i = 0; i < cars.length; i++) {
            if (secim.equalsIgnoreCase(cars[i])&(i<3)) {
                fiyat = rnd.nextInt(20000,40000);
                System.out.printf("Sectiginiz araba %s, fiyati %d. İyi günlerde kullanın.", cars[i], fiyat);
                flag = false;
                break;
            } else if (secim.equalsIgnoreCase(cars[i])&(i<5)) {
                fiyat = rnd.nextInt(50000,80000);
                System.out.printf("Sectiginiz araba %s, fiyati %d. İyi günlerde kullanın", cars[i], fiyat);
                flag = false;
                break;
            } else if (secim.equalsIgnoreCase(cars[i])&i>=5) {
                fiyat = rnd.nextInt(100000,150000);
                System.out.printf("Sectiginiz araba %s, fiyati %d. İyi günlerde kullanın.", cars[i], fiyat);
                flag = false;
                break;
            }
        }
        if (flag) {

            System.out.println("Lütfen yukardaki Listeden seciniz.");
        }
    }
}
