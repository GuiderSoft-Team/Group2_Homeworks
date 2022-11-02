package day20;

public class MAXMIN {
    public static void main(String[] args) {
        //        HOMEWORK
//        Task
        //       Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //      En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.


        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
        int maxSayi = arr[0];
        int minSayi = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxSayi) {
                maxSayi = arr[i];
            }

            if (arr[i] < minSayi) {
                minSayi = arr[i];
            }
        }
        System.out.println("En buyuk sayi" + maxSayi);
        System.out.println("Enkucuk sayi" + minSayi);
    }

}
