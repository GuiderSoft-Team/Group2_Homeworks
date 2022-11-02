package day14;

public class Task {
    public static void main(String[] args) {
        //TODO: İki tamsayı değişkenine değerleri assign ediniz.
        /*
            Önce bunları isimleri ve değerleriyle birlikte ekrana yazdırınız.
            Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
         */
        int x=7;
        int y=5;
        System.out.printf("x = %d\n",x);
        System.out.printf("y = %d\n",y);
        int z=x;
        x=y;
        y=z;
        System.out.printf("x = %d\n",x);
        System.out.printf("y = %d\n",y);



    }
}
