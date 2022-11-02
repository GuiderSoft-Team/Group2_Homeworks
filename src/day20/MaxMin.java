package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        //Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
        //
        int max=0;
        int min=0;

        Scanner input=new Scanner(System.in);
        int sayidizini;
        int []rastgeleSayilar=new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Dizinin "+(i+1)+". elemanını giriniz: ");
            rastgeleSayilar[i]= input.nextInt();
            //Burada sayıları 10. elemana kadar hafızaya alıyor.

            if(i==0){
                max=rastgeleSayilar[i];
                min=rastgeleSayilar[i];

            }
            if  (rastgeleSayilar[i]>max){
                max=rastgeleSayilar[i];
            } else if (rastgeleSayilar[i]<min){
                min=rastgeleSayilar[i];
            }
        }
        System.out.println("Dizinin En Büyük Elemanı: "+max);
        System.out.println("Dizinin En Küçük Elemanı: "+min);
        }

    }
