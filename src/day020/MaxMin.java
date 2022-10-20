package day020;

import java.awt.font.FontRenderContext;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        //T:Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        // En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
        // Not: Problemi, Grup2_Homeworks ( GitHub'da var) projesi içerisine day20 package'ı açıp,
        // MaxMin sınıfı oluşturarak çözünüz.
        int[] sayilar=new int [10];
        System.out.println(sayilar);
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"'inci sayıyı giriniz:");
                Scanner input=new Scanner (System.in);
                sayilar[i]=input.nextInt();
        }
        System.out.println("Dizinin en küçük ve en büyük sayıları hesaplanıyor...");
        int min=sayilar[0]; int max=sayilar[0];
        for (int i = 0; i < 10; i++) {
            if(sayilar[i]<=min){
                min=sayilar[i];
            }
            if(sayilar[i]>=max){
                max=sayilar[i];
            }
                    }
        System.out.println("En küçük sayı:" +min );
        System.out.println("En büyük sayi:"+max);

    }
}
