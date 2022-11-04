package day22;

import java.util.Random;
import java.util.Scanner;

public class Task88 {
    public static void main(String[] args) {

        String[] cars={"Honda","Toyota","Nissan","BMW","Mercedes","Porsche","Ferrari"};

        int k= cars.length;
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1)+"."+cars[i]);
        }

        System.out.println();
        System.out.print("Seciminiz : ");
        Scanner input=new Scanner(System.in);
        int secim= input.nextInt();

//        Random rnd1=new Random(20000);
//        int fiyat1=rnd1.nextInt(40000);


        int price1=30000;
        int price2=60000;
        int price3=130000;



        if (secim<4){
            System.out.printf("Sectiginiz araba %s fiyati %d€",cars[secim-1],price1);

        }
//        Random rnd2=new Random(50000);
//        int fiyat2=rnd2.nextInt(80000);
        if (secim>3 & secim<6){
            System.out.printf("Sectiginiz araba %s fiyati %d€",cars[secim-1],price2);
        }
//        Random rnd3=new Random(100000);
//        int fiyat3=rnd3.nextInt(150000);
        if (secim>5 & secim<8){
            System.out.printf("Sectiginiz araba %s fiyati %d€",cars[secim-1],price3);
        }
    }
}
