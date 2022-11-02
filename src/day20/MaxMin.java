package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        /*Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
        Not: Problemi, Grup2_Homeworks ( GitHub'da var) projesi içerisine day20 package'ı açıp,
         MaxMin sınıfı oluşturarak çözünüz.*/
        int max=0;
        int min=0;
        Scanner input=new Scanner(System.in);
        int []sayi=new int[10];
        for(int i = 0; i < sayi.length; i++)
        {
            System.out.print((i+1) + ". sayıyı giriniz =  ");
            sayi[i] = input.nextInt();
            if(i==0){
                max=sayi[i];
                min=sayi[i];
            }
            if(sayi[i]>max) {
                max=sayi[i];
            }if (sayi[i]<min) {
            min=sayi[i];
        }
        }
        System.out.println("En büyük sayı = "+max);
        System.out.println("En küçük sayı = "+min);
    }
}

