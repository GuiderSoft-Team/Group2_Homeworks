package day22;

import java.util.Scanner;

public class MathRandomCars {
    public static void main(String[] args) {
        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        int fiyat;
        Scanner input=new Scanner(System.in);

        for (int i = 1; i < cars.length; i++) {
            System.out.println(i+"-"+cars[i]);
        }
        System.out.print("Seçiminiz :");
        int secim= input.nextInt();
        if(secim>=1 & secim<=3){
           fiyat = (int)(Math.random()*20000)+20000;
        } else if (secim>=4 & secim<=5) {
            fiyat = (int)(Math.random()*50000)+30000;
        }else {
            fiyat = (int)(Math.random()*100000)+50000;
        }
        System.out.printf("Seçiminiz %s, fiyatı = %d, iyi günlerde kullanın.",cars[secim],fiyat);
    }
}
