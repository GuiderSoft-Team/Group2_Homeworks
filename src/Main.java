import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]sayilar=new int[10];

        System.out.println("10 adet sayi giriniz");
        for (int i = 0; i < sayilar.length; i++) {
            Scanner input=new Scanner(System.in);
            System.out.print(i+1+" nci sayiyi giriniz:");
            sayilar[i]=input.nextInt();

        }


        int maxValue=sayilar[0];
        int minValue=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]>maxValue){
                maxValue=sayilar[i];
            } else if (sayilar[i]<minValue) {
                minValue=sayilar[i];

            }


        }

        System.out.printf("Max sayi=%5d\nMin sayi=%5d",maxValue,minValue);

    }
}
