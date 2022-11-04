package day22;

import java.util.Random;
import java.util.Scanner;

public class Task88 {
    public static void main(String[] args) {

        Random rnd = new Random();
        String[] cars={"Honda","Toyota","Nissan","BMW","Mercedes","Porsche","Ferrari"};

        int k= cars.length;
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1)+"."+cars[i]);
        }

        System.out.println();
        System.out.print("Seciminiz : ");
        Scanner input=new Scanner(System.in);
        int secim= input.nextInt();


       int price1=rnd.nextInt(20000,40000);
       int price2=rnd.nextInt(50000,80000);
       int price3=rnd.nextInt(100000,150000);


        if (secim<4){
            System.out.printf("Sectiginiz araba %s fiyati %d€",cars[secim-1],price1);

        }

        if (secim>3 & secim<6){
            System.out.printf("Sectiginiz araba %s fiyati %d€",cars[secim-1],price2);
        }

        if (secim>5 & secim<8){
            System.out.printf("Sectiginiz araba %s fiyati %d€",cars[secim-1],price3);
        }
        else {
            System.out.println("Yanlis secim yaptiniz.");
        }
    }
}
