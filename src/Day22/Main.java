package Day22;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int priceOne = random.nextInt(20000)+20000;
        int pricetwo = random.nextInt(20000)+40000;
        int pricethree = random.nextInt(20000)+60000;

        String [] cars={"Ford","Renalt","Nissan","Mitsubishi","Range Rover","Saab","Dacia","Scoda","Mercedes"};
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
                case 4, 5, 6 -> System.out.printf("--Araç fiyatı: %d $--", pricetwo);
                case 7, 8, 9 -> System.out.printf("--Araç fiyatı: %d $--", pricethree);
                default -> {
                    System.out.println("-".repeat(30));
                    System.err.print("Listeden bir araç Seçiniz\n");
                }
            }
        }while (secim<=0 | secim>=10);

    }
}
