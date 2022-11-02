package day20;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        /*Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
                En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
*/

        System.out.println("Numbers Arrays");
        System.out.print("1. Number :");
        int n1=new Scanner(System.in).nextInt();
        System.out.print("2. Number :");
        int n2=new Scanner(System.in).nextInt();
        System.out.print("3. Number :");
        int n3=new Scanner(System.in).nextInt();
        System.out.print("4. Number :");
        int n4=new Scanner(System.in).nextInt();
        System.out.print("5. Number :");
        int n5=new Scanner(System.in).nextInt();
        System.out.print("6. Number :");
        int n6=new Scanner(System.in).nextInt();
        System.out.print("7. Number :");
        int n7=new Scanner(System.in).nextInt();
        System.out.print("8. Number :");
        int n8=new Scanner(System.in).nextInt();
        System.out.print("9. Number :");
        int n9=new Scanner(System.in).nextInt();
        System.out.print("10. Number :");
        int n10=new Scanner(System.in).nextInt();
        int[] sayilar={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};


        int max=n1;
        int min=n1;

        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]>max){
                max=sayilar[i];
            }else if (sayilar[i]<min){
                min=sayilar[i];
                }

            }
        System.out.println();

        System.out.printf("Max sayi=%5d\nMin sayi=%5d",max,min);

        }


    }










