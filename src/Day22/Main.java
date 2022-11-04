package Day22;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int priceOne = random.nextInt(20000)+20000;
        int pricetwo = random.nextInt(30000)+50000;
        int pricethree = random.nextInt(50000)+100000;

        String [] cars={"Honda","Toyoto","Nissan","BMV","Mercedes","Porsche","Ferrari"};
        Scanner imput=new Scanner(System.in);
        int secim=0;

        do {
            for (int i = 0; i < cars.length; i++) {
                if(i==0){
                    System.out.println("Fiyat almak için Model Seçiniz");
                }
                System.out.printf("%d - %s\n",i+1,cars[i]);
            }

            System.out.print("Seçiminiz:? ");
            secim=imput.nextInt();

            switch (secim) {
                case 1, 2, 3 -> System.out.printf("--Araç fiyatı: %d $--", priceOne);
                case 4, 5 -> System.out.printf("--Araç fiyatı: %d $--", pricetwo);
                case 6, 7 -> System.out.printf("--Araç fiyatı: %d $--", pricethree);
                default -> {
                    System.out.println("-".repeat(30));
                    System.err.print("Listeden bir araç Seçiniz\n");
                }
            }
        }while (secim<=0 | secim>=8);

    }
}
