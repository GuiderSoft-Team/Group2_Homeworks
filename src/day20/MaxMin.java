package day20;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        //    Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //   En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

        //   Not: Problemi, Grup2_Homworks ( GitHub'da var) projesi içerisine day20 package'ı açıp, MaxMin sınıfı oluşturarak çözünüz.
        System.out.println("10 adet sayi giriniz");
        Scanner input= new Scanner(System.in);
        int[] sayilar= new int [10];
        for(int i=0; i<sayilar.length; i++){
            System.out.println((i+1)+ ". Sayi :");
            sayilar[i]= input.nextInt();
        }
       int max=sayilar[0];
        int min=sayilar[0];

        for(int i=1;i<sayilar.length;i++){
            if(max<sayilar[i]){
                max= sayilar[i];
            }
            if(min>sayilar[i]){
                min= sayilar[i];
            }

        }
        System.out.println("En buyuk sayi: "+ max);
        System.out.println("En kucuk sayi: "+ min);
    }
    }

