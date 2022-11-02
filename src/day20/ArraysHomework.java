package day20;

import java.util.Scanner;

public class ArraysHomework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] newList = new int[10];
        for (int i = 0; i < newList.length; i++) {
            System.out.println(i + 1 + ". Numarayı giriniz");
            newList[i] = input.nextInt();
        }
        int  min = newList[0];
        int  max=newList[0];
        for (int i : newList) {
            if (i < min) {
                min=i;
            }if (i>max){
                max=i;
            }
        }
        System.out.println("min değer: "+min);
        System.out.println("max değer: "+max);
    }}

