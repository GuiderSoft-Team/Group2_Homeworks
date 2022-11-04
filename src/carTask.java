import java.util.Random;
import java.util.Scanner;

public class carTask {
    public static void main(String[] args) {
/*
Task
String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};

dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
1. Honda
2. Toyota
...     şeklinde olacaktır.

Listenin en altında kullanıcıdan seçim yapması istenilecektir.

Kullanıcının seçtiği arabaya uygun fiyat;
      Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
Şeklinde gösterilecektir.

Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
Honda – Toyota – Nissan (Random price between 20000 and 40000)
BMW-Mercedes(Random price between 50000 and 80000)
Porsche - Ferrari(Random price between 100000 and 150000)

 */

        String[] carNo = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};





     int secim=0;
     String[] numbers = new String[7];
     carNo[1] = "Honda";
     carNo[2] = "Toyota";
     carNo[3] = "Nissan";
     carNo[4] = "BMW";
     carNo[5] = "Mercedes";
     carNo[6] = "Porsche";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Araba secin ");
        String car=scanner.next();


        Random honda=new Random(20000);
        int fiyat= honda.nextInt(40000);
        System.out.println("Seçtiğiniz araba Honda  %s, fiyatı %d. İyi günlerde kullanın.");




        System.out.println(carNo);
        switch (secim){
         case 1:
             System.out.printf(" Seçtiğiniz araba Honda  %s, fiyatı %d. İyi günlerde kullanın.");


             break;
         case 2:
             System.out.printf("Seçtiğiniz araba Nissan  %s, fiyatı %d. İyi günlerde kullanın.");

             break;
         case 3:
             System.out.printf("Seçtiğiniz araba BMW  %s, fiyatı %d. İyi günlerde kullanın.");


             break;
         case 4:
             System.out.printf("Seçtiğiniz araba Mersedes %s, fiyatı %d. İyi günlerde kullanın.");
             break;

             case 5:
                System.out.printf("Seçtiğiniz araba Porshe %s, fiyatı %d. İyi günlerde kullanın.");

            case 6:
                System.out.printf("Seçtiğiniz araba Ferrari %s, fiyatı %d. İyi günlerde kullanın.");












        }


    }
}
