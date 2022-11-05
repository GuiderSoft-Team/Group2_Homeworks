package day15;

import java.util.Scanner;

public class TaskDenemeUcgen {
    public static void main(String[] args) {
        System.out.println("ucgenın iç acıları toplamı");
        System.out.print("kenar 1 giriniz:");
        int k1=new Scanner(System.in).nextInt();
        System.out.print("kenar 2 giriniz:");
        int k2=new Scanner(System.in).nextInt();
        System.out.print("kenar 3 giriniz:");
        int k3=new Scanner(System.in).nextInt();
        final int UCGEN_IC_ACILAR_TOPLAMI=180;
        int toplamacılar=k1+k2+k3;
        if (toplamacılar==UCGEN_IC_ACILAR_TOPLAMI){
            System.out.println("bu bir ucgendir");
        }else {
            System.out.println("bu bir ucgen degildir");
        }

    }
}
