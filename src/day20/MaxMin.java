package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
    //Task:Klavyeden girilen 10 adet sayı,
        // bir tam sayı dizisi içinde tutulacaktır.
        //En büyük ve en küçük sayıları bulup
        // ekranda gösteren Java programını yazınız.
        int[] numbers=new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Bir sayi giriniz: ");
            numbers[i]= input.nextInt();
        }
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            } else if (numbers[i]<min) {
                min=numbers[i];
            }
        }
        System.out.println("En büyük sayi "+max);
        System.out.println("En kücük sayi "+min);

    }
}
