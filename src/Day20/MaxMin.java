package Day20;

public class MaxMin {
    public static void main(String[] args) {
         /*
    Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
    En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

     */
        int[] sayilar={25,42,31,69,83,76,11,19,95,56};
        int enbuyuksayi=sayilar[0];
        int enkucuksayi=sayilar[0];

        for (int i = 0; i <sayilar.length; i++) {
            if (sayilar[i]>enbuyuksayi){
                enbuyuksayi=sayilar[i];

            }
            if (sayilar[i]<enkucuksayi){
                enkucuksayi=sayilar[i];
            }

        }
        System.out.println("En büyük sayı: "+enbuyuksayi);
        System.out.println("En küçük sayı: "+enkucuksayi);

    }
}
