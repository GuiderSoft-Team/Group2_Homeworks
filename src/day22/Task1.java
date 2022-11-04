package day22;

import java.util.Scanner;

public class Task1 {
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

        String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};


            System.out.println("1.Honda ");
            System.out.println("2.Toyota ");
            System.out.println("3. Nissan");
            System.out.println("4.BMW ");
            System.out.println("5. Mercedes");
            System.out.println("6.Porsche ");
            System.out.println("7.Ferrari");

        System.out.print("Hangi arabayı seçtiniz? [1-7]: ");
        Scanner input=new Scanner(System.in);
        int secim= input.nextInt();
        System.out.printf("Seçtğiniz araba %s"+" ", cars[secim-1 ]);


        switch (secim){
            case 1 :


                double fiyat=Math.round(100000*Math.random());
                System.out.println("Fiyatı :"+fiyat+" " +"iyi günlerde kullanınız");
                break;

            case 2 :
                double fiyat1=Math.round(100000*Math.random());
                System.out.println("Fiyatı :"+fiyat1+" " +"iyi günlerde kullanınız");
                break;

            case 3:
                double fiyat3=Math.round(100000*Math.random());

                System.out.println("Fiyatı :"+fiyat3+" " +"iyi günlerde kullanınız");
                break;

            case 4:
                double fiyat4=Math.round(100000*Math.random());
                System.out.println("Fiyatı :"+fiyat4+" " +"iyi günlerde kullanınız");
                break;

            case 5:
                double fiyat5=Math.round(100000*Math.random());
                System.out.println("Fiyatı :"+fiyat5+" " +"iyi günlerde kullanınız");
                break;

            case 6:

                double fiyat6=Math.round(10000000*Math.random());
                System.out.println("Fiyatı :"+fiyat6+" " +"iyi günlerde kullanınız");
                break;


            case 7:
                double fiyat7=Math.round(10000000*Math.random());
                System.out.println("Fiyatı :"+fiyat7+" " +"iyi günlerde kullanınız");
                break;

            default:
                System.out.println("verilen değer aralığında seçim yapınız");
                break;



        }


        }
    }





























