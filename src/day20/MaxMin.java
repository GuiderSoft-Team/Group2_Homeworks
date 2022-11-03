package day20;


import java.util.Scanner;

public class MaxMin {


    public static void main(String[] args) {

        /*
        Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
         */


        System.out.println("lütfen 10 adet sayı giriniz :");
        Scanner scan = new Scanner(System.in);
        int [] sayilar = new int[10];
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println((i+1+". sayı :"));
            sayilar [i] = scan.nextInt();

        }
        int min = sayilar [0];
        int max = sayilar[0];

        for (int i = 0; i < sayilar.length ; i++) {
            if (min>sayilar[i]){
                min=sayilar[i];
            }
            if (max<sayilar[i]){
                max=sayilar[i];
            }
        }
        System.out.println("en büyük sayi"+max);
        System.out.println("en küçük sayi"+min);
    }
}







































  

     

