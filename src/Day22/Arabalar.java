package Day22;

import java.util.Random;
import java.util.Scanner;

public class Arabalar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        System.out.println("Araç Listesi");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + " - " + cars[i]);
        }

        System.out.print("Araç Seciniz:");
        int sec=input.nextInt();
        System.out.println("Seçtiğiniz araba "+cars[sec-1]+", fiyatı "+fiyatBelirleme(sec)+". İyi günlerde kullanın");

        }

    public static int fiyatBelirleme(int secim){
        Random rnd=new Random();
        int fiyat=0;
        if (secim>0&secim<=3){
            fiyat= rnd.nextInt(20000,40000);

        }
        if (secim>3&secim<=5){
           fiyat= rnd.nextInt(50000,80000);

        }
        if (secim>5&secim<=7){
             fiyat=rnd.nextInt(100000,150000);

        }

        return fiyat;


    }
}
