package Day20;

public class MaxMin {
    public static void main(String[] args) {
         /*
    Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
    En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

     */
        int[] sayilar=new int[10];
        Scanner input = new Scanner(System.in);


        for (int i = 0; i <sayilar.length; i++) {

            for (int j = 1; j <=10; j++) {
                System.out.print(j+". sayıyı giriniz: ");
                i=j-1;
                sayilar[i]= input.nextInt();
            }

            break;
        }
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
