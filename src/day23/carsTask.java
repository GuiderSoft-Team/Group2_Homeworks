package day23;

import java.util.Random;
import java.util.Scanner;

public class carsTask {
    public static void main(String[] args) {
        //String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        //
        //dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
        //1. Honda
        //2. Toyota
        //...     şeklinde olacaktır.
        //
        //Listenin en altında kullanıcıdan seçim yapması istenilecektir.
        //
        //Kullanıcının seçtiği arabaya uygun fiyat;
        //      Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
        //Şeklinde gösterilecektir.
        //
        //Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
        //Honda – Toyota – Nissan (Random price between 20000 and 40000)
        //BMW-Mercedes(Random price between 50000 and 80000)
        //Porsche - Ferrari(Random price between 100000 and 150000)

        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        int fiyat=0;

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i+1)+". :" +cars[i]);

        }
        int Random = (int)(Math.random() *2);
        System.out.println( "Lütfen fiyatını görmek istediğiniz araçlardan birini seçiniz: ");
        Scanner secim = new Scanner(System.in);
        int arac=secim.nextInt();

        Random rnd=new Random();
        if (arac-1<3){
            fiyat=rnd.nextInt(40000-20000) + 20000;;

        } else if (3<=arac-1 && arac-1<5) {
            fiyat=rnd.nextInt(80000-50000) + 50000;

        }else {
            fiyat=rnd.nextInt(150000-100000) + 100000;
        }


        System.out.println("Seçtiğiniz araba "  + cars[arac-1] + " fiyatı " +fiyat+ " İyi günlerde kullanın.");
        }



    }

