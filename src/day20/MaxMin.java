



package day20;

public class MaxMin {
    public static void main(String[] args) {
        //klavyeden girilen 10 adet sayı,bir tamsayı dizisi içinde tutulacaktır.En buyuk ve en küçük sayıları bulup ekranda gösteren bir java programı yazınız.

        int[] dizi = new int[]{5, 10, 23, 3, -7, -1, 45, 97, 69, 82};
        int min = dizi[0];
        int max = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < min) {
                min = dizi[i];
            }
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }
        System.out.println("En büyük sayı=" + max);
        System.out.println("En küçük sayı=" + min);

    }
}