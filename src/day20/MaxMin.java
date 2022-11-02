package day20;


import java.util.Scanner;

public class MaxMin {


    public static void main(String[] args) {

        /*
        Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
         */


        Scanner scan = new Scanner(System.in);

        int min = 0;  int max = 0 ;

        int [] sayilar = new int[10];


        for(int i = 0; i < 10; i++)
        {
            System.out.print("bir adet sayı girip entera basınız :");
            sayilar[i] = scan.nextInt();
            if(i< min) {
                max = sayilar[i];
                min = sayilar[i];
            }
            if(sayilar[i] > max) {
                max = sayilar[i];
            }
            if(sayilar[i] < min) {
                min = sayilar[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı = " + max);
        System.out.println("Dizinin en kucuk elemanı = " + min);

    }
}







































  

     

