package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min;
        int max;
        int[] number=new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the numbers.");
            number[i]=input.nextInt();

        }
        min=number[0];
        max=number[0];

        for (int i = 1 ; i < number.length; i++) {
            if (number[i]<min){
                min=number[i];

            }
            if (number[i]>max){
                max=number[i];
            }

        }
        System.out.println("The min number is: "+min);
        System.out.println("The max number is: "+max);

    }
}
