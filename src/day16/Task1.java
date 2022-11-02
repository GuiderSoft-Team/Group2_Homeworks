package day16;

public class Task1 {
    public static void main(String[] args) {

        System.out.print("(0-20) arası Çift Sayılar \t\t : ");
        for (int i = 0; i <=20; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("(0-20) arası Tek Sayılar\t\t : ");

        int toplam=0;
        for (int i = 0; i <20; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
                toplam=toplam+i;
            }
        }
        System.out.print("---> Tek Sayıların toplamı :"+toplam);
        System.out.println();
        System.out.print("(0-100) 10'a Bölünebilen Sayılar : ");
        for (int i = 0; i <= 100; i++) {
            if (i%10==0){
                System.out.print(i+" ");
            }
        }
    }
}
