package day22;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
            System.out.println("Secebileceginiz araba markalari");
            showMenu();
            Scanner input=new Scanner(System.in);
            System.out.print("Lütfen hayalinizdeki arabayi seciniz = ");
            String secim=input.nextLine();
            switch (secim){
                case "1":
                    System.out.println("Seciminiz : HONDA");
                    System.out.println(Math.round(rastgeleAraliktaSayi(20000,40000)));
                    break;
                case "2":
                    System.out.println("Seciminiz : TOYOTA");
                    System.out.println(Math.round(rastgeleAraliktaSayi(20000,40000)));
                    break;
                case "3":
                    System.out.println("Seciminiz : NISSAN");
                    System.out.println(Math.round(rastgeleAraliktaSayi(50000,80000)));
                    break;
                case "4":
                    System.out.println("Seciminiz : BMV");
                    System.out.println(Math.round(rastgeleAraliktaSayi(50000,80000)));
                    break;
                case "5":
                    System.out.println("Seciminiz : MERCEDES");
                    System.out.println(Math.round(rastgeleAraliktaSayi(100000,150000)));
                    break;
                case "6":
                    System.out.println("Seciminiz : PORSCHE");
                    System.out.println(Math.round(rastgeleAraliktaSayi(100000,150000)));
                    break;
                default:
                    break;
            }




        }public static void showMenu(){
        String[] cars={"Honda","Toyata","Nissan","BMV","Mercedes","Porsche"};
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". "+cars[i]);
        }
    }public static double rondomSayi(){
        return Math.round(2000*Math.random());
    }public static double rastgeleAraliktaSayi(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }
}
