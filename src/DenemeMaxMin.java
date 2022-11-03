import java.util.Scanner;

public class DenemeMaxMin {
    public static void main(String[] args) {


        int[] sayilar = new int[10];
        int minimumDeger;
        int maksimumDeger;
        for (int i = 0; i < sayilar.length; i++) {
            Scanner input=new Scanner(System.in);
            System.out.print("Lütfen sayıyı giriniz: ");
            sayilar[i] = input.nextInt();
        }

        minimumDeger = sayilar[0];
        maksimumDeger = sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {


            if (sayilar[i] < minimumDeger) {
                minimumDeger = sayilar[i];
            }
            if (sayilar[i] > maksimumDeger) {
                maksimumDeger = sayilar[i];
            }

        }

        System.out.println("Minimum Değer: " + minimumDeger);
        System.out.print("Maksimum Değer: " + maksimumDeger);


    }
}
