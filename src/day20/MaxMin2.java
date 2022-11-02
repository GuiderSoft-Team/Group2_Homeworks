package day20;

import java.util.Scanner;

public class MaxMin2 {
    public static void main(String[] args) {


        System.out.print("Number : ");

        int[] sayilar=new int[10];

        int max=sayilar[0];
        int min=sayilar[0];


        for (int i = 0; i <sayilar.length ; i++) {
            numbers(sayilar[i]);

            if (sayilar[0]>max){
                max=sayilar[i];
            }else if (sayilar[0]<min){
                min=sayilar[i];
            }

        }
        System.out.println();

        System.out.printf("Max sayi=%5d\nMin sayi=%5d",max,min);


    }

    public static int numbers(int number){
        return new Scanner(System.in).nextInt();
    }
}
